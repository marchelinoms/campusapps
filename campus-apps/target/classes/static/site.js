window.addEventListener("load", () => {
    const container = document.querySelector(".container");
    const wrapper = document.querySelector(".wrapper");
    const attention = document.querySelector(".attention");
    if (container != null) {
        container.classList.add("translation");
    } else if (wrapper != null) {
        wrapper.classList.add("slide");
    }
})
function overlay() {
	el = document.getElementById("overlay");
	el.style.visibility = (el.style.visibility == "visible") ? "hidden" : "visible";
}

const btnDec = document.querySelectorAll(".btn-dec");
const selBtn = document.querySelector("#selectBtn");

window.addEventListener("change", () => {
    if (selBtn.value == 0) {
        btnDec[0].style.zIndex = 1;
        btnDec[1].style.zIndex = -1;
        btnDec[2].style.zIndex = -1;
    } else if (selBtn.value == 1) {
        btnDec[1].style.zIndex = 1;
        btnDec[2].style.zIndex = -1;
        btnDec[0].style.zIndex = -1;
    } else if (selBtn.value == 2) {
       btnDec[2].style.zIndex = 1;
       btnDec[0].style.zIndex = -1;
       btnDec[1].style.zIndex = -1;
    }
}
)

function overlay2() {
	el = document.getElementById("overlay2");
	el.style.visibility = (el.style.visibility == "visible") ? "hidden" : "visible";
}
const btnDecx = document.querySelectorAll(".btn-decx");
const selBtnx = document.querySelector("#selectBtnx");

window.addEventListener("change", () => {
    if (selBtnx.value == 0) {
        btnDecx[0].style.zIndex = 1;
        btnDecx[1].style.zIndex = -1;
        btnDecx[2].style.zIndex = -1;
    } else if (selBtnx.value == 1) {
        btnDecx[1].style.zIndex = 1;
        btnDecx[2].style.zIndex = -1;
        btnDecx[0].style.zIndex = -1;
    } else if (selBtnx.value == 2) {
       btnDecx[2].style.zIndex = 1;
       btnDecx[0].style.zIndex = -1;
       btnDecx[1].style.zIndex = -1;
    }
}
)
