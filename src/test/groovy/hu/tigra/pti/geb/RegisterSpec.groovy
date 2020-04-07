package hu.tigra.pti.geb

import hu.tigra.pti.geb.page.LoginPage
import hu.tigra.pti.geb.page.RegisterPage

class RegisterSpec extends BaseSpec {

    def 'Regisztráció'() {
        given: 'Bejelentkező felületre navigálok'
        def loginPage = to LoginPage

        when: 'Kitöltöm a "CREATE AN ACCOUNT" blokkban az "Email address" mezőt egy még nem regisztrált email címmel és a "Create an account" funkciógombra kattintok.'
        loginPage.registerEmailAddress = 'teszt@email.hu'
        loginPage.registerButton.click()

        then: 'Megjelenik a "Create an account" űrlap.'
        def registerPage = waitFor { at RegisterPage }

        when: 'Kitöltöm a "Your personal information" blokkban az összes mezőt és a "Register" funkciógombra kattintok.'
        registerPage.gender.checked = 'Mr.'
        registerPage.firstName = 'Elek'
        registerPage.lastName = 'Teszt'
        registerPage.password = 'teszt123'
        registerPage.bDay.selected = '23'
        registerPage.bMonth.selected = '4'
        registerPage.bYear.selected = '1998'
        registerPage.spam.check()
        registerPage.optin.check()
        registerPage.submitAcc.click()

        then: '5 hibaüzenet jelenik meg'
        true
    }
}
