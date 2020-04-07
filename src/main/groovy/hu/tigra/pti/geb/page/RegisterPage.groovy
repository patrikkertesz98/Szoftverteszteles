package hu.tigra.pti.geb.page

import geb.Page
import geb.module.RadioButtons

class RegisterPage extends Page {

    static url = 'index.php?controller=authentication&back=my-account#account-creation'

    static at = { header.text() == 'CREATE AN ACCOUNT' }

    static content = {
        header { $('h1[class="page-heading"]') }
        gender { $('input[type="radio"][name="id_gender"]').module(RadioButtons) }
        firstName { $('input[id="customer_firstname"]') }
        lastName { $('input[id="customer_lastname"]') }
        password { $('input[id="passwd"]') }
        bDay { $('select[id="days"][name="days"').module(Select) }
        bMonth { $('select[id="months"][name="months"]').module(Select) }
        bYear { $('select[id="years"][name="years"]').module(Select) }
        optin { $('input[id="optin"]').module(Checkbox) }
        submitAcc { $('button[id="submitAccount"]') }
        spam { $('input[id="newsletter"]').module(Checkbox) }
        errMsg { $('div[class="alert alert-danger"] ol li') }
    }
}
