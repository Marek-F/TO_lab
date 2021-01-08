package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Utest : strona aplikacji Utest</p>
     */
    public static Object URL
     
    /**
     * <p>Profile Utest : Logowanie do strony</p>
     */
    public static Object LoginID
     
    /**
     * <p>Profile Utest : has&#322;o</p>
     */
    public static Object pwd
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            LoginID = selectedVariables['LoginID']
            pwd = selectedVariables['pwd']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
