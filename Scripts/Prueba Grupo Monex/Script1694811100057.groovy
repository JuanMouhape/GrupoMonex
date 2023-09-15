import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.sikuli.script.*;

public static void setText(Screen screen,String imgCampoTexto,String contenido){
        OnClick(screen,imgCampoTexto);
        Pattern txtCampoTexto = new Pattern(imgCampoTexto);
        try {
                screen.type(txtCampoTexto,contenido);
        } catch (FindFailed e) {
                throw new RuntimeException(e);
        }
}

public static void OnClick(Screen screen,String btnObject){
        try {
                screen.wait(btnObject);
                screen.click(btnObject);
        } catch (FindFailed e) {
                throw new RuntimeException(e);
        }
}

App application = new App("D:\\PruebaSistemaVenta\\java\\SistemaVenta.exe");
application.open();
String btnUsuarios="D:\\PruebaSistemaVenta\\java\\btnUsuarios.png";
Screen screen = new Screen();
OnClick(screen,btnUsuarios);
String btnNuevoUsuario="D:\\PruebaSistemaVenta\\java\\btnNuevoUsuario.png";
OnClick(screen,btnNuevoUsuario);

String imgNombreUsuario="D:\\PruebaSistemaVenta\\java\\txtNombreUsuario.png";
setText(screen,imgNombreUsuario,"Juan Cruz");

String imgApellidoPaterno="D:\\PruebaSistemaVenta\\java\\txtApellidoPaterno.png";
setText(screen,imgApellidoPaterno,"Mamani");

String imgApellidoMaterno="D:\\PruebaSistemaVenta\\java\\txtApellidoMaterno.png";
setText(screen,imgApellidoMaterno,"Chura");

String imgDomicilio="D:\\PruebaSistemaVenta\\java\\txtDomicilio.png";
setText(screen,imgDomicilio,"Barrio Las Americas");

String tmgTelefono="D:\\PruebaSistemaVenta\\java\\txtTelefono2.png";
setText(screen,tmgTelefono,"591781405942");

String btnRegistrar="D:\\PruebaSistemaVenta\\java\\btnRegistrar.png";
OnClick(screen,btnRegistrar);
                
screen.type(Key.F4, Key.ALT);
OnClick(screen,btnUsuarios);
screen.type(Key.F4,Key.ALT);
