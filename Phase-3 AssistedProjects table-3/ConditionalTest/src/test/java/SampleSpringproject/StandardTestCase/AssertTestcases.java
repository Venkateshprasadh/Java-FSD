package SampleSpringproject.StandardTestCase;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.runner.RunWith;


public class AssertTestcases {

	 @Test
	  @EnabledOnOs(OS.MAC)
	 public void runOnlyOnMacOs() {
	      System.out.println("Run the batch job only on MAC OS");
	  }
	  @Test
	  @EnabledOnOs({ OS.LINUX, OS.MAC })
	  public void runOnlyOnLinuxOrMac() {
	    System.out.println("Run the batch job only on LINUX or MAC OS");
	  }
	  @Test
	  @DisabledOnOs(OS.WINDOWS)
	  public void notRunOnWindows() {
	    System.out.println("Not run the batch job on WINDOWS OS");
	  }
	  
	  @Test
	  @EnabledOnOs({ OS.WINDOWS })
	  public void runOnlyOnWindows() {
	    System.out.println("Run the batch job only on WINDOWS OS");
	  }
	  
	  @Test
	    @DisabledOnOs({OS.AIX, OS.LINUX, OS.SOLARIS})
	  public void notRunOnAIXorLinuxOrSolaris() {
	        System.out.println("Not run the batch job on AIX or LINUX or SOLARIS");
	    } 
}



