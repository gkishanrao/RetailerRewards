package com.example.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Rewards {
	
	 private long customerId;
		
		private long lastMonthRewardPoints;
	    private long lastSecondMonthRewardPoints;
	    private long lastThirdMonthRewardPoints;
	    private long totalRewards;

  
	    
	   


		public long getCustomerId() {
			return customerId;
		}


		public long getLastMonthRewardPoints() {
			return lastMonthRewardPoints;
		}


		public long getLastSecondMonthRewardPoints() {
			return lastSecondMonthRewardPoints;
		}


		public long getLastThirdMonthRewardPoints() {
			return lastThirdMonthRewardPoints;
		}


		public long getTotalRewards() {
			return totalRewards;
		}


		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}


		public void setLastMonthRewardPoints(long lastMonthRewardPoints) {
			this.lastMonthRewardPoints = lastMonthRewardPoints;
		}


		public void setLastSecondMonthRewardPoints(long lastSecondMonthRewardPoints) {
			this.lastSecondMonthRewardPoints = lastSecondMonthRewardPoints;
		}


		public void setLastThirdMonthRewardPoints(long lastThirdMonthRewardPoints) {
			this.lastThirdMonthRewardPoints = lastThirdMonthRewardPoints;
		}


		public void setTotalRewards(long totalRewards) {
			this.totalRewards = totalRewards;
		}
}
