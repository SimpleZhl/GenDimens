package com.simple.zhl.gen;


public enum DimenTypes {

    //适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
	//300,320,360,411，450
	 DP_sw__300(300),  // values-sw300
	 DP_sw__320(320),
	 DP_sw__340(340),
	 DP_sw__360(360),
	 DP_sw__380(380),
	 DP_sw__390(390),
	 DP_sw__410(411),
	 DP_sw__430(430),
	 DP_sw__450(450),
	 DP_sw__470(470),
	 DP_sw__480(480);

	// 想生成多少自己以此类推

    /**
     * 屏幕最小宽度
     */
    private int swWidthDp;

    DimenTypes(int swWidthDp) {

        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
