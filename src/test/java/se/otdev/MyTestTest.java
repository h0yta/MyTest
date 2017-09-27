package se.otdev;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;
import se.otdev.entity.TestFour;
import se.otdev.entity.TestOne;
import se.otdev.entity.TestThree;
import se.otdev.entity.TestTwo;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class MyTestTest {

    @Test
    public void equalsTest() {
        TestOne actual = createModel(41);
        TestOne expected = createModel(41);

        Assert.assertTrue(new EqualsBuilder().setTestRecursive(true).reflectionAppend(actual, expected).isEquals());
    }

    private TestOne createModel(Integer startId) {
        TestFour fourOne = new TestFour(startId + 1, "FourOne", "DescFour");
        TestFour fourTwo = new TestFour(startId + 2, "FourTwo", "DescFour");
        TestFour fourThree = new TestFour(startId + 3, "FourThree", "DescFour");
        TestFour fourFour = new TestFour(startId + 4, "FourFour", "DescFour");

        TestThree threeOne = new TestThree(31, "ThreeOne", "DescThree");

        TestTwo twoOne = new TestTwo(21, "TwoOne", "DescTwo", asList(fourOne, fourTwo, fourThree, fourFour));

        TestOne oneOne = new TestOne(11, "OneOne", "DescOne", twoOne, threeOne);

        return oneOne;
    }
}
