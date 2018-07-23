Feature: Develop a calculator
    with add, subtract methods
    
#	Scenario: Add Scenario
#	    Given Open a calculator and give 2 and 3 as input
#	    When click on add
#	    Then verify 5 is the output
#	    
#	Scenario: Add Scenario
#	    Given Open a calculator and give 6 and 3 as input
#	    When click on sub
#	    Then verify 3 is the output
	    
	Scenario Outline: scenario description
		Given Open a calculator and give <a> and <b> as input
		When click on <action>
		Then verify <output> is the output
			
			Examples:
			| a | b | action |output|
			| 4 | 3 | add    | 7|
			
	
	    
	
    
      
    