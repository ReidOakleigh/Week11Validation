
       function validate() {
        console.log("Validating...");
          if(document.getElementById(name).value === "") {
             alert("Please provide a name");
             document.input.name.focus();
             return false;
          }

          if(document.getElementById(address).value === "") {
             alert("Please provide an address");
             document.input.address.focus();
             return false;
          }

          if(document.getElementById(city).value === "") {
             alert("Please provide a city");
             document.input.city.focus();
             return false;
          }

          if(document.getElementById(state).value === "") {
             alert("Please provide a state");
             document.input.state.focus();
             return false;
          }

          if(document.getElementById(zip).value.length !== 5 || isNaN(document.getElementById(zip).value)) {
             alert("Please provide a valid ZIP code");
             document.input.zip.focus();
             return false;
          }

          if(document.getElementById(phone).value.length !== 10 || isNaN(document.getElementById(phone).value)) {
             alert("Please provide a valid telephone number");
             document.input.phone.focus();
             return false;
          }


          var emailID = document.getElementById(email).value;
          atpos = emailID.indexOf("@");
          dotpos = emailID.lastIndexOf(".");

          if (atpos < 1 || ( dotpos - atpos < 2 )) {
             alert("Please enter correct email ID")
             document.getElementById(email).focus() ;
             return false;
          }
          return true;
       }
