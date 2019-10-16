/*
 * Copyright 2011-2019 Koreanair.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.koreanair.ms_ibe.service.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class FareCalendarElementVO {
	private String departureDate = "";
	private String returnDate = "";
	private String commercialFareFamilyType = "";
	private String commercialFareFamilyDesc = "";
	private String fareFamilyType = "";
	private String fareFamilyDesc = "";
	private boolean emptyFare = false;
	private String amount = "";
	private String totalAmount = "";
	private String tax = "";
	private String fuelCharge = "";
	private boolean lowest = false;
	private List<TravellerTypeFareInfoVO> travellerTypeFareInfoList = new ArrayList<>();
}
