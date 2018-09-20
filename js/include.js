function includeHTML() {
    const elements = document.querySelectorAll("[include-html]");

    Array.from(elements).forEach((element) => {
        const file = element.getAttribute("include-html")
        const xhttp = new XMLHttpRequest()
        xhttp.onreadystatechange = function() {
		const {readyState, status} = this
		console.log(this)
		if (readyState === 4) {
		    if (status === 200 || status === 304) {
		        element.innerHTML = this.responseText
		    } else if (status === 404) {
		        console.log("Page not found.")
		    }
		    element.removeAttribute("include-html");
		}
	}
        xhttp.open("GET", file, true)
        xhttp.send()
    })
}
includeHTML()
