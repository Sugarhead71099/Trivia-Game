import java.util.HashMap;
import java.util.ArrayList;

public class QuestionDatabase {
	
	private final HashMap<String, String> hM = new HashMap<String, String>();
	private ArrayList<String> questions = new ArrayList<String>();
	private int score = 0;
	
	protected QuestionDatabase() {
		questions.add(/*0*/"WHAT IS THE OUTPUT OF: \"System.out.println(5 * 5);\" ? ");
		questions.add(/*1*/"HOW MANY \"BASIC\" VARIABLE TYPES ARE THERE IN JAVA? ");
		questions.add(/*2*/"WHAT IS THE OUTPUT OF THE FOLLOWING? : \n\n\tfor(int i = 0; i < 10; i++) {\n\t\tSystem.out.println(i);\n\t} ");
		questions.add(/*3*/"WHAT DOES \"JDK\" STAND FOR? ");
		questions.add(/*4*/"WHAT IS THE OUTPUT OF: \"System.out.println(10 % 3);\" ? ");
		questions.add(/*5*/"WHAT IS THE SINGLE WORD USED TO CALL A CLASS CONSTUCTOR? ");
		questions.add(/*6*/"TRUE OR FALSE: YOU CAN CREATE MULTIPLE CONSTUCTORS. ");
		questions.add(/*7*/"TRUE OR FALSE: THE LIFETIME OF A VARIABLE DECLARED IN A METHOD IS UNTIL THE PROGRAM ENDS. ");
		questions.add(/*8*/"TRUE OR FALSE: LOCAL VARIABLES ARE DECLARED IN THE METHOD BODY. ");
		questions.add(/*9*/"TRUE OR FALSE: THE LIFETIME OF INSTANCE VARIABLES END AFTER THE PROGRAM IS TERMINATED / ENDS. ");
		questions.add(/*10*/"TRUE OR FALSE: OPERATORS, SUCH AS \"*, /, +, -, etc...\", CREATES THE SPACE IN MEMORY FOR THE NEW OBJECT. ");
		questions.add(/*11*/"ABBREVIATION: UEFI - ");
		questions.add(/*12*/"ABBREVIATION: IDE - ");
		questions.add(/*13*/"ABBREVIATION: DMZ -");
		
		hM.put(questions.get(0), "25");
		hM.put(questions.get(1), "5");
		hM.put(questions.get(2), "0123456789");
		hM.put(questions.get(3), "java development kit");
		hM.put(questions.get(4), "1");
		hM.put(questions.get(5), "new");
		hM.put(questions.get(6), "true");
		hM.put(questions.get(7), "false");
		hM.put(questions.get(8), "true");
		hM.put(questions.get(9), "true");
		hM.put(questions.get(10), "true");
		hM.put(questions.get(11), "unified extensible firmware interface");
		hM.put(questions.get(12), "integrated device electronics");
		hM.put(questions.get(13), "de-militarized zone");
	}

	public String getQuestion(int rangeIndex) {
		String currentQuestion = questions.get(rangeIndex);
		if(currentQuestion.isEmpty()) {
			while(currentQuestion.isEmpty()) {
				hM.remove(questions.get(rangeIndex));
				questions.remove(rangeIndex);
				rangeIndex = (int) (Math.random() * questions.size());
				currentQuestion = questions.get(rangeIndex);
				score++;
			}
		}
		return currentQuestion;
	}
	
	public String checkAnswer(String question, String answer) {
		if(answer.length() > 0) {
			if(answer.equals(hM.get(question))) {
				hM.remove(question);
				questions.remove(question);
				score++;
				return "\nYour answer is correct!!! :)";
			} else
				return "\nSorry, but that's incorrect. The correct answer is: \"" + hM.get(question) + "\"";
		} else
			return "INCORRECT!!! Please input an answer next time";
	}
	
	public int getScore() {
		return score;
	}
	
	public int getArrLength() {
		return questions.size();
	}
	
}





	//	ANATOMY AND PHYSIOLOGY - RESPIRATORY SYSTEM
//	questions.add(/*0*/"EXCHANGE OF GASES IN THE LUNGS OCCURS BETWEEN THESE 2 THINGS: ");
//	questions.add(/*1*/"THIS EXCHANGE OF GASES IS CALLED: ");
//	questions.add(/*2*/"THE AREA IN THE BACK OF THE MOUTH THAT SERVES AS THE PASSAGEWAY FOR BOTH NOSE AND MOUTH: ");
//	questions.add(/*3*/"THE MEMBRANE THAT COVERS THE SURFACE OF THE LUNG IS CALLED: ");
//	questions.add(/*4*/"GIVE THE COMMON NAMES FOR 1-PHARYNX & 2-LARYNX: ");
//	questions.add(/*5*/"THE RESPIRATORY MEMBRANE WALLS OF THE ALVEOLI AND CAPILARIES ARE MADE UP OF: ");
//	questions.add(/*6*/"SIMPLE SQUAMOUS EPITHELIAL TISSUES ARE ONE CELL THICK TO ALLOW FOR GAS EXCHANGE BETWEEN THESE TWO GASES: ");
//	questions.add(/*7*/"RESPIRAYORY CONTROL IS LOCATED IN WHICH 2 PARTS OF THE NERVOUS SYSTEM? ");
//	questions.add(/*8*/"TRUE OR FALSE: THE ALVEOLI PRODUCES A SURFACTANT TO KEEP THE LUNGS FROM COLLAPSING AND STICKING TOGETHER. ");
//	questions.add(/*9*/"TRUE OR FALSE: SEROUS FLUID IS LOCATED BETWEEN THE VISCERAL AND PLEURA MEMBRANE THAT SURROUNDS EACH LUNG AND PREVENTS FRICTION. ");
//	questions.add(/*10*/"WHAT IS THE FLAP THAT COVERS THE WINDPIPE WHEN EATING CALLED: ");
//	questions.add(/*11*/"THE TRIANGULAR OPENING FOUND BETWEEN THE VOCAL CORDS IS CALLED THE:  ");
//	questions.add(/*12*/"DURING GAS EXCHANGE, 98% OF THIS IS TRANSPORTED IN THE BLOODSTREAM BY A PROTEIN MOLECULE CALLED HEMOGLOBIN, WHICH IS LOCATED ON RBCS: ");
//	questions.add(/*13*/"WHAT IS THE EQUATION FOR WHAT HAPPENS TO CO2 IN THE BLOODSTREAM? ");
/*
hM.put(questions.get(0), "capillaries and alveoli");
hM.put(questions.get(1), "diffusion");
hM.put(questions.get(2), "pharynx");
hM.put(questions.get(3), "visceral pleura");
hM.put(questions.get(4), "throat and voicebox");
hM.put(questions.get(5), "simple squamous epithelial");
hM.put(questions.get(6), "o2 and co2");
hM.put(questions.get(7), "pons and medulla oblongata");
hM.put(questions.get(8), "true");
hM.put(questions.get(9), "true");
hM.put(questions.get(10), "epiglottis");
hM.put(questions.get(11), "glottis");
hM.put(questions.get(12), "oxygen");
hM.put(questions.get(13), "CO2+H2O-H2CO3-H+HCO3");
*/

	//	Endocrine System
//	questions.add(/*0*/"SALIVA GLANDS PRODUCE DIGESTIVE ENZYMES THAT ARE PRODUCED IN WHAT KIND OF GLANDS? ");
//	questions.add(/*1*/"WHAT HORMONE REGUATES MILK PRODUCTION? ");
//	questions.add(/*2*/"WHAT HORMONE CAUSES THE KIDNEYS TO RETAIN WATER TO INCREASE BLOOD PRESSURE? ");
//	questions.add(/*3*/"WHAT HORMONE CAUSES Na+/MINERAL TO BE REABSORBED BY KIDNEYS AND INCREASE BLOOD VOLUME/PRESSURE? ");
//	questions.add(/*4*/"WHAT DISEASE IS DUE TO DESTRUCTION TO BETA CELLS AND NO HORMONE PRODUCTION? ");
//	questions.add(/*5*/"THIS HORMONE EXTRACTS SUGAR FROM THE LIVER TO PUT INTO THE BLOOD. ");
//	questions.add(/*6*/"WHAT HORMONE INCREASES THE USE OF VITAL ORGANS DURING EMERGENCY SITUATIONS? ");
//	questions.add(/*7*/"THIS HORMONE COULD CAUSE AN ANURSYM IN A BOOD VESSEL DUE TO INCREASE IN BLOOD VOLUME? ");
//	questions.add(/*8*/"WHAT DO ENDOCRINE GLANDS SECRETE? ");
//	questions.add(/*9*/"WHAT ARE TARGET CELLS? ");
//	questions.add(/*10*/"WHAT DO EXOCRINE GLANDS DEAL WITH? ");
//	questions.add(/*11*/"FILL IN THE BLANKS: \n\tTHE EFFECTS OS HORMONES \"MAY BE _____ OR MAY LAST FOR ____\".");
//	questions.add(/*12*/"TRUE OR FALSE: A NEGATIVE FEEDBACK LOOP ONLY RUNS UNTIL THE BODY REACHES HOMEOSTASIS.");
//	questions.add(/*13*/"FILL IN THE BLANK: \n\tTHE PUTUITARY GLAND IS LOCATED AT THE BASE OF THE _____, IT IS ABOUT ___ cm IN DIAMETER AND RESTS IN A SMALL DEPRESSION CALLED THE _____ _______, WHICH IS A FEATURE OF THE ________. ");
//	questions.add(/*14*/"FILL IN THE BLANK: \n\tTHE PITUITARY GLAND HAS TWO LOBES, AN ________ LOBE (AKA THE ADENOHYPOPHYSIS) AND A _________ LOBE (AKA THE NEUROHYPOPHYSIS). ");
//	questions.add(/*15*/"THE ADENOHYPOPHTSIS SECRETES WHAT THREE HORMONES? ");
//	questions.add(/*16*/"OVERSECRETION OF THIS HORMONE BEFORE PUBERTY CAN RESULT IN GIANTISM. ");
//	questions.add(/*17*/"THIS HORMONE COMES FROM THE ADRENAL CORTEX AND AFFECTS THE KIDNEYS. ");
//	questions.add(/*18*/"INSUFFICIENCE OF THIS HORMONE CAN RESULT IN DIABETES INSIPIDUS");
//	questions.add(/*19*/"THIS HORMONE IS RELEASED IN ORDER TO RAISE BLOOD SUGAR LEVELS. ");
//	questions.add(/*20*/"TRUE OR FALSE: ANTI-DIURETIC HORMONE AND OXYTOCIN ARE CHEMICALLY SIMILAR AND PEROFORM A SIMILAR FUNCTION. ");
//	questions.add(/*21*/"TRUE OR FALSE: THE POSTERIOR LOBE OF THE PITUITARY GLAND SECRETES TWO HORMONES. ");
//	questions.add(/*22*/"TRUE OR FALSE: DESTRUCTION OF BETA CELLS IN THE PANCREAS LEADS TO DIABETES MILLITUS TYPE 2. ");
//	questions.add(/*23*/"THIS HORMONE IS AN ANTAGONIST TO CALCITONIN");
//	questions.add(/*24*/"");
//	questions.add(/*25*/"");
//	questions.add(/*26*/"");
//	questions.add(/*27*/"");
//	questions.add(/*28*/"");
//	questions.add(/*29*/"");
/*
hM.put(questions.get(0), "exocrine glands");
hM.put(questions.get(1), "prolactin");
hM.put(questions.get(2), "anti-diuretic hormone");
hM.put(questions.get(3), "aldosterone");
hM.put(questions.get(4), "type 1 diabetes");
hM.put(questions.get(5), "glucagon");
hM.put(questions.get(6), "adrenaline");
hM.put(questions.get(7), "aldosterone");
hM.put(questions.get(8), "hormones");
hM.put(questions.get(9), "destination glands");
hM.put(questions.get(10), "ducts and tubes");
hM.put(questions.get(11), "hours days");
hM.put(questions.get(12), "true");
hM.put(questions.get(13), "brain 1 sella turcica sphenoid");
hM.put(questions.get(14), "anterior posterior");
hM.put(questions.get(15), "growth hormone prolactin and adrenocartacotrophic");
hM.put(questions.get(16), "growth hormone");
hM.put(questions.get(17), "aldosterone");
hM.put(questions.get(18), "anti-diuretic hormone");
hM.put(questions.get(19), "glucagon");
hM.put(questions.get(20), "true");
hM.put(questions.get(21), "true");
hM.put(questions.get(22), "false");
hM.put(questions.get(23), "parathormone");
hM.put(questions.get(24), "");
hM.put(questions.get(25), "");
hM.put(questions.get(26), "");
hM.put(questions.get(27), "");
hM.put(questions.get(28), "");
hM.put(questions.get(29), "");
*/

	// Urinary System
//	questions.add(/*0*/"TRUE OR FALSE:\tTHE URINARY SYSTEM REMOVES UNWANTED WASTE PRODUCTS FROM THE BLOOD AND ACTIVATES VITAMIN D3 ");
//	questions.add(/*1*/"TRUE OR FALSE\tTHE URINARY SYSTEM REGULATES BLOOD PRESSURE, BUT DOESN'T REGULATE BLOOD pH ");
//	questions.add(/*2*/"WHAT DOES THE URINARY SYSTEM SECRETE? ");
//	questions.add(/*3*/"WHERE DO LEFT OVER MATERIALS (GOOD) RETURN AFTER BEING FILTERED THROUGH THE KIDNEYS? ");
//	questions.add(/*4*/"WHERE DO LEFT OVER MATERIALS (BAD) GO AFTER BEING FILTERED THROUGH THE KIDNEYS? ");
//	questions.add(/*5*/"TRUE OR FALSE:\tTHE LEFT KIDNEY IS LOWER THAN THE RIGHT ");
//	questions.add(/*6*/"TRUE OR FALSE:\tTHE RIGHT KIDNEY IS PUSHED DOWN BY THE LIVER ");
//	questions.add(/*7*/"WHERE IS THE LOCATION OF THE KIDNEYS");
//	questions.add(/*8*/"WHAT DOES THE SHAPE OF THE KIDNEYS POTRAY? ");
//	questions.add(/*9*/"WHAT ARE THE 3 EXTERNAL STRUCTURES OF THE KIDNEY? ");
//	questions.add(/*10*/"LIST THE 5 INTERNAL STRUCTURES OF THE KIDNEY. ");
//	questions.add(/*11*/"WHAT IS THE REANL ARTERY RESPONSIBLE FOR? ");
//	questions.add(/*12*/"WHAT DOES THE RENAL VEIN DO? ");
//	questions.add(/*13*/"WHAT IS THE URETER? ");
//	questions.add(/*14*/"WHAT IS THE HILUM? ");
//	questions.add(/*15*/"WHAT IS THE RESPONSIBILITY OF THE RENAL PELIVS? ");
//	questions.add(/*16*/"WHAT ARE THE 2 HORMONES THE KIDNEY SECRETES? ");
//	questions.add(/*17*/"TRUE OR FALSE:\tTHE KIDNEYS ARE ABOUT THE SIZE OF THE HEART ");
//	questions.add(/*18*/"WHAT DOES THE RENAL FASCIA DO? ");
//	questions.add(/*19*/"NAME THE 3 INNER REGIONS OF THE KIDNEY. ");
//	questions.add(/*20*/"WHAT IS ANOTHER WORD FOR PAPILLAE? ");
//	questions.add(/*21*/"WHAT ARE THE PYRAMIDS IN THE KIDNEYS RESPONSIBILE FOR? ");
//	questions.add(/*22*/"TRUE OR FALSE:\tTHERE ARE 2 MILLIONS NEPHRONS PER KIDNEY ");
//	questions.add(/*23*/"WHERE DOES THE RENAL ARTERY SEND BLOOD? ");
//	questions.add(/*24*/"WHERE DOES THE RENAL VEIN SEND BLOOD? ");
//	questions.add(/*25*/"WHICH WAY DOES BLOOD TRAVEL THROUGH THE AFFERENT ARTERIOLE? ");
//	questions.add(/*26*/"WHICH WAY DOES BLOOD TRAVEL THROUGH THE EFFERENT ARTERIOLE? ");
//	questions.add(/*27*/"");
//	questions.add(/*28*/"");
//	questions.add(/*29*/"");
//	questions.add(/*30*/"");
//	questions.add(/*31*/"");
//	questions.add(/*32*/"");
//	questions.add(/*33*/"");
//	questions.add(/*34*/"");
//	questions.add(/*35*/"");
//	questions.add(/*36*/"");
//	questions.add(/*37*/"");
//	questions.add(/*38*/"");
//	questions.add(/*39*/"");
/*
hM.put(questions.get(0), "true");
hM.put(questions.get(1), "false");
hM.put(questions.get(2), "erthropoetin");
hM.put(questions.get(3), "the bloodstream");
hM.put(questions.get(4), "the bladder");
hM.put(questions.get(5), "false");
hM.put(questions.get(6), "true");
hM.put(questions.get(7), "retroperitoneal");
hM.put(questions.get(8), "a kidney bean");
hM.put(questions.get(9), "renal capsule, adipose capsule, and renal fascia");
hM.put(questions.get(10), "renal artery, renal vein, ureter, hilum, and renal pelvis");
hM.put(questions.get(11), "supplies blood to the kidneys from the aorta");
hM.put(questions.get(12), "return blood to the inferior vena cava");
hM.put(questions.get(13), "tubes that lead from the kidneys to the bladder");
hM.put(questions.get(14), "opening in the kidneys for vessels to travel through");
hM.put(questions.get(15), "fullty expand upper end of ureter");
hM.put(questions.get(16), "aldosterone and anti-diuretic hormone");
hM.put(questions.get(17), "true");
hM.put(questions.get(18), "keep the kidneys attached to the back");
hM.put(questions.get(19), "pelvis, medulla, and cortex");
hM.put(questions.get(20), "apex");
hM.put(questions.get(21), "filteration");
hM.put(questions.get(22), "false");
hM.put(questions.get(23), "into the kidneys");
hM.put(questions.get(24), "out of the kidneys");
hM.put(questions.get(25), "in");
hM.put(questions.get(26), "out");
hM.put(questions.get(27), "");
hM.put(questions.get(28), "");
hM.put(questions.get(29), "");
hM.put(questions.get(30), "");
hM.put(questions.get(31), "");
hM.put(questions.get(32), "");
hM.put(questions.get(33), "");
hM.put(questions.get(34), "");
hM.put(questions.get(35), "");
hM.put(questions.get(36), "");
hM.put(questions.get(37), "");
hM.put(questions.get(38), "");
hM.put(questions.get(39), "");
*/


	// AP Computer Science Questions
//	questions.add(/*0*/"WHAT IS THE OUTPUT OF: \"System.out.println(5 * 5);\" ? ");
//	questions.add(/*1*/"HOW MANY \"BASIC\" VARIABLE TYPES ARE THERE IN JAVA? ");
//	questions.add(/*2*/"WHAT IS THE OUTPUT OF THE FOLLOWING? : \n\n\tfor(int i = 0; i < 10; i++) {\n\t\tSystem.out.println(i);\n\t} ");
//	questions.add(/*3*/"WHAT DOES \"JDK\" STAND FOR? ");
//	questions.add(/*4*/"WHAT IS THE OUTPUT OF: \"System.out.println(10 % 3);\" ? ");
//	questions.add(/*5*/"WHAT IS THE SINGLE WORD USED TO CALL A CLASS CONSTUCTOR? ");
//	questions.add(/*6*/"TRUE OR FALSE: YOU CAN CREATE MULTIPLE CONSTUCTORS. ");
//	questions.add(/*7*/"TRUE OR FALSE: THE LIFETIME OF A VARIABLE DECLARED IN A METHOD IS UNTIL THE PROGRAM ENDS. ");
//	questions.add(/*8*/"TRUE OR FALSE: LOCAL VARIABLES ARE DECLARED IN THE METHOD BODY. ");
//	questions.add(/*9*/"TRUE OR FALSE: THE LIFETIME OF INSTANCE VARIABLES END AFTER THE PROGRAM IS TERMINATED / ENDS. ");
//	questions.add(/*10*/"TRUE OR FALSE: OPERATORS, SUCH AS \"*, /, +, -, etc...\", CREATES THE SPACE IN MEMORY FOR THE NEW OBJECT. ");
//	questions.add(/*11*/"ABBREVIATION: UEFI - ");
//	questions.add(/*12*/"ABBREVIATION: IDE - ");
//	questions.add(/*13*/"ABBREVIATION: DMZ -");
/*
hM.put(questions.get(0), "25");
hM.put(questions.get(1), "5");
hM.put(questions.get(2), "0123456789");
hM.put(questions.get(3), "java development kit");
hM.put(questions.get(4), "1");
hM.put(questions.get(5), "new");
hM.put(questions.get(6), "true");
hM.put(questions.get(7), "false");
hM.put(questions.get(8), "true");
hM.put(questions.get(9), "true");
hM.put(questions.get(10), "true");
hM.put(questions.get(11), "unified extensible firmware interface");
hM.put(questions.get(12), "integrated device electronics");
hM.put(questions.get(13), "de-militarized zone");
*/