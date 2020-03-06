package com.test.builderpatten;

/**
 * 待抢单列表参数
 */
public class WaybillBcList {
	private final String shopId;
	private final String wId;
	private final String batchId;
	private final String distance;
	private final String sendProvince;
	private WaybillBcList(Builder builder) {
		this.shopId = builder.shopId;
		this.wId = builder.wId;
		this.batchId = builder.batchId;
		this.distance = builder.distance;
		this.sendProvince = builder.sendProvince;
	}

	public static class Builder {
		private String shopId;
		private String wId;
		private String batchId;
		private String distance;
		private String sendProvince;
		public Builder shopId(String shopId){
			this.shopId = shopId;
			return this;
		}
		public Builder wId(String wId){
			this.wId = wId;
			return this;
		}
		public Builder batchId(String batchId){
			this.batchId = batchId;
			return this;
		}
		public Builder distance(String distance){
			this.distance = distance;
			return this;
		}
		public Builder sendProvince(String sendProvince){
			this.sendProvince = sendProvince;
			return this;
		}
		public WaybillBcList build(){
			return new WaybillBcList(this);
		}
	}
}
