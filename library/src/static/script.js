
document.getElementById("bookForm")
    .addEventListener("submit",
        function(event){

        let bName = document.getElementById("bName").value.trim();
        let aName = document.getElementById("aName").value.trim();
        let price = document.getElementById("price").value.trim();
        let noOfCopies = document.getElementById("noOfCopies").value.trim();
        let isAvailable = document.querySelector('input[name="isAvailable"]:checked');

        if(bName === "" ){
        alert("Please enter valid Book Name..");
        event.preventDefault();
        return;
        }

        if(bName === "" ){
                alert("Please enter valid Book Name..");
                event.preventDefault();
                return;
        }

        if(aName === "" ){
                alert("Please enter valid Author Book Name..");
                event.preventDefault();
                return;
                }

        if(price <= 0 ){
                        alert("Please enter valid Price..");
                        event.preventDefault();
                        return;
                        }

        if(noOfCopies <= 0 ){
                                alert("Please enter valid Number of Copies..");
                                event.preventDefault();
                                return;
                                }

        if(!isAvailable){
                alert("Please select availability of book..");
                event.preventDefault();
                return;
                }

        })