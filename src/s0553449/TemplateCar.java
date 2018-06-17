package s0553449;

import lenz.htw.ai4g.ai.DriverAction;
import lenz.htw.ai4g.ai.Info;

public class /*<n*/TemplateCar/*>*/ extends MyCarMain{
    
    public /*<n*/TemplateCar/*>*/(Info info) {
        super(info);
        // approachPower = /*<f*/1.44f/*>*/;
        // turnVelocity = /*<f*/6.05f/*>*/;
        targetWeight = /*<f*/0.98f/*>*/;
        obstacleWeight = /*<f*/9.17f/*>*/;
        feelerDistance = /*<f*/13.49f/*>*/;
        feelerDistanceSides = /*<f*/10.49f/*>*/;
        feelerAngle = /*<f*/0.75f/*>*/;
        
	    cornerOffset = /*<f*/30/*>*/;
	    cornerPostOffset = /*<f*/10f/*>*/;
	    targetPointShift = /*<f*/60f/*>*/;
    }

    @Override
    protected void init() {
        // enlistForInternalDevelopmentPurposesOnlyAndDoNOTConsiderThisAsPartOfTheHandedInSolution();
		calculateGraph();
    }

    @Override
    public String getName() {
        return /*<n*/"TemplateCar"/*>*/;
    }

    @Override
    public DriverAction update(boolean arg0) {
        return super.update(arg0);
    }
}