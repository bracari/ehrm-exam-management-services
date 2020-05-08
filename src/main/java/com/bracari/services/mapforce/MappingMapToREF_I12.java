/**
 * MappingMapToREF_I12.java
 *
 * This file was generated by MapForce 2020r2.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package com.bracari.services.mapforce;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import com.altova.text.tablelike.*;
import com.altova.text.*;
import com.altova.text.edi.*;
import java.util.*;

public class MappingMapToREF_I12 extends com.altova.TraceProvider {
	private boolean runDoesCloseAll = true;
	public void setCloseObjectsAfterRun(boolean c) {runDoesCloseAll = c;}
	public boolean getCloseObjectsAfterRun() {return runDoesCloseAll;}


	static class main implements IEnumerable {
		com.altova.mapforce.IMFNode var1_ExamManagement_3_1_Instance;

		public main(com.altova.mapforce.IMFNode var1_ExamManagement_3_1_Instance)	{
			this.var1_ExamManagement_3_1_Instance = var1_ExamManagement_3_1_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}

		public static class Enumerator implements IEnumerator {
			int pos = 0;
			int state = 2;
			Object current;
			main closure;
			com.altova.mapforce.IEnumerable var2_ExamManagementEventN;

			public Enumerator(main closure) {
				this.closure = closure;
			}

			public Object current() {return current;}

			public int position() {return pos;}

			public boolean moveNext() throws Exception {
				while (state != 0) {
					switch (state) {
						case 2: if (moveNext_2()) return true; break;
					}
				}
				return false;
			}

			private boolean moveNext_2() throws Exception {
				state = 0;				
				var2_ExamManagementEventN = new com.altova.functions.Core.SequenceCache(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ExamManagementEventNotification", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), closure.var1_ExamManagement_3_1_Instance));
				current = com.altova.functions.Core.createElement("GroupFHS", com.altova.functions.Core.box(com.altova.functions.Core.createElement("GroupBHS", com.altova.functions.Core.box(com.altova.functions.Core.createElement("Message_REF_I12", com.altova.functions.Core.box(com.altova.functions.Core.createElement("PID", (new seq1_join(var2_ExamManagementEventN)))))))));
				pos++;
				return true;
			}


			public void close() {
			}
		}
	}
	static class seq1_join implements IEnumerable {
		com.altova.mapforce.IEnumerable var1_ExamManagementEventN;

		public seq1_join(com.altova.mapforce.IEnumerable var1_ExamManagementEventN)	{
			this.var1_ExamManagementEventN = var1_ExamManagementEventN;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}

		public static class Enumerator implements IEnumerator {
			int pos = 0;
			int state = 1;
			Object current;
			seq1_join closure;
			IEnumerator var2_ExamManagementEventN;
			IEnumerator var3_ExamSchedulingReques;
			IEnumerator var6_ExamManagementEventN;
			IEnumerator var4_PostDischargeClaimIn;
			IEnumerator var7_ExamSchedulingReques;
			IEnumerator var5_VeteranServiceMember;
			IEnumerator var8_PostDischargeClaimIn;
			IEnumerator var9_VeteranServiceMember;

			public Enumerator(seq1_join closure) {
				this.closure = closure;
			}

			public Object current() {return current;}

			public int position() {return pos;}

			public boolean moveNext() throws Exception {
				while (state != 0) {
					switch (state) {
						case 1: if (moveNext_1()) return true; break;
						case 2: if (moveNext_2()) return true; break;
						case 3: if (moveNext_3()) return true; break;
						case 4: if (moveNext_4()) return true; break;
						case 5: if (moveNext_5()) return true; break;
						case 6: if (moveNext_6()) return true; break;
						case 7: if (moveNext_7()) return true; break;
						case 8: if (moveNext_8()) return true; break;
						case 9: if (moveNext_9()) return true; break;
						case 10: if (moveNext_10()) return true; break;
						case 12: if (moveNext_12()) return true; break;
						case 13: if (moveNext_13()) return true; break;
						case 14: if (moveNext_14()) return true; break;
						case 15: if (moveNext_15()) return true; break;
						case 16: if (moveNext_16()) return true; break;
						case 17: if (moveNext_17()) return true; break;
						case 18: if (moveNext_18()) return true; break;
						case 19: if (moveNext_19()) return true; break;
					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				current = com.altova.functions.Core.createElement("PID-6", (new seq2_join(closure.var1_ExamManagementEventN)));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 3;				
				var2_ExamManagementEventN = (closure.var1_ExamManagementEventN).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 5;				
				if (!var2_ExamManagementEventN.moveNext()) {state = 4; return false; }
				var3_ExamSchedulingReques = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ExamSchedulingRequestCreatedEvent", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var2_ExamManagementEventN.current())))).enumerator();
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 12;				
				if( var2_ExamManagementEventN != null ) { var2_ExamManagementEventN.close(); var2_ExamManagementEventN = null; }
				var6_ExamManagementEventN = (closure.var1_ExamManagementEventN).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 7;				
				if (!var3_ExamSchedulingReques.moveNext()) {state = 6; return false; }
				var4_PostDischargeClaimIn = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("PostDischargeClaimInformation", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var3_ExamSchedulingReques.current())))).enumerator();
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 3;				
				if( var3_ExamSchedulingReques != null ) { var3_ExamSchedulingReques.close(); var3_ExamSchedulingReques = null; }
				return false;
			}
			private boolean moveNext_7() throws Exception {
				state = 9;				
				if (!var4_PostDischargeClaimIn.moveNext()) {state = 8; return false; }
				var5_VeteranServiceMember = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("VeteranServiceMemberInfo", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var4_PostDischargeClaimIn.current())))).enumerator();
				return false;
			}
			private boolean moveNext_8() throws Exception {
				state = 5;				
				if( var4_PostDischargeClaimIn != null ) { var4_PostDischargeClaimIn.close(); var4_PostDischargeClaimIn = null; }
				return false;
			}
			private boolean moveNext_9() throws Exception {
				state = 9;				
				if (!var5_VeteranServiceMember.moveNext()) {state = 10; return false; }
				current = com.altova.functions.Core.createElement("PID-7", com.altova.functions.Core.box(com.altova.CoreTypes.dateToString(com.altova.CoreTypes.parseDate(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("dateOfBirth", ""), ((com.altova.mapforce.IMFNode)(var5_VeteranServiceMember.current())))))))));
				pos++;
				return true;
			}
			private boolean moveNext_10() throws Exception {
				state = 7;				
				if( var5_VeteranServiceMember != null ) { var5_VeteranServiceMember.close(); var5_VeteranServiceMember = null; }
				return false;
			}
			private boolean moveNext_12() throws Exception {
				state = 14;				
				if (!var6_ExamManagementEventN.moveNext()) {state = 13; return false; }
				var7_ExamSchedulingReques = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ExamSchedulingRequestCreatedEvent", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var6_ExamManagementEventN.current())))).enumerator();
				return false;
			}
			private boolean moveNext_13() throws Exception {
				state = 0;				
				if( var6_ExamManagementEventN != null ) { var6_ExamManagementEventN.close(); var6_ExamManagementEventN = null; }
				return false;
			}
			private boolean moveNext_14() throws Exception {
				state = 16;				
				if (!var7_ExamSchedulingReques.moveNext()) {state = 15; return false; }
				var8_PostDischargeClaimIn = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("PostDischargeClaimInformation", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var7_ExamSchedulingReques.current())))).enumerator();
				return false;
			}
			private boolean moveNext_15() throws Exception {
				state = 12;				
				if( var7_ExamSchedulingReques != null ) { var7_ExamSchedulingReques.close(); var7_ExamSchedulingReques = null; }
				return false;
			}
			private boolean moveNext_16() throws Exception {
				state = 18;				
				if (!var8_PostDischargeClaimIn.moveNext()) {state = 17; return false; }
				var9_VeteranServiceMember = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("VeteranServiceMemberInfo", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var8_PostDischargeClaimIn.current())))).enumerator();
				return false;
			}
			private boolean moveNext_17() throws Exception {
				state = 14;				
				if( var8_PostDischargeClaimIn != null ) { var8_PostDischargeClaimIn.close(); var8_PostDischargeClaimIn = null; }
				return false;
			}
			private boolean moveNext_18() throws Exception {
				state = 18;				
				if (!var9_VeteranServiceMember.moveNext()) {state = 19; return false; }
				current = com.altova.functions.Core.createElement("PID-8", com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("gender", ""), ((com.altova.mapforce.IMFNode)(var9_VeteranServiceMember.current())))))));
				pos++;
				return true;
			}
			private boolean moveNext_19() throws Exception {
				state = 16;				
				if( var9_VeteranServiceMember != null ) { var9_VeteranServiceMember.close(); var9_VeteranServiceMember = null; }
				return false;
			}


			public void close() {
				try {
					if( var5_VeteranServiceMember != null ) { var5_VeteranServiceMember.close(); var5_VeteranServiceMember = null; }
					if( var4_PostDischargeClaimIn != null ) { var4_PostDischargeClaimIn.close(); var4_PostDischargeClaimIn = null; }
					if( var3_ExamSchedulingReques != null ) { var3_ExamSchedulingReques.close(); var3_ExamSchedulingReques = null; }
					if( var2_ExamManagementEventN != null ) { var2_ExamManagementEventN.close(); var2_ExamManagementEventN = null; }
					if( var9_VeteranServiceMember != null ) { var9_VeteranServiceMember.close(); var9_VeteranServiceMember = null; }
					if( var8_PostDischargeClaimIn != null ) { var8_PostDischargeClaimIn.close(); var8_PostDischargeClaimIn = null; }
					if( var7_ExamSchedulingReques != null ) { var7_ExamSchedulingReques.close(); var7_ExamSchedulingReques = null; }
					if( var6_ExamManagementEventN != null ) { var6_ExamManagementEventN.close(); var6_ExamManagementEventN = null; }
				} catch (Exception e) {
				}
			}
		}
	}
	static class seq2_join implements IEnumerable {
		com.altova.mapforce.IEnumerable var1_ExamManagementEventN;

		public seq2_join(com.altova.mapforce.IEnumerable var1_ExamManagementEventN)	{
			this.var1_ExamManagementEventN = var1_ExamManagementEventN;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}

		public static class Enumerator implements IEnumerator {
			int pos = 0;
			int state = 1;
			Object current;
			seq2_join closure;
			IEnumerator var2_ExamManagementEventN;
			IEnumerator var3_ExamSchedulingReques;
			IEnumerator var6_ExamManagementEventN;
			IEnumerator var4_PostDischargeClaimIn;
			IEnumerator var7_ExamSchedulingReques;
			IEnumerator var5_VeteranServiceMember;
			IEnumerator var8_PostDischargeClaimIn;
			IEnumerator var9_VeteranServiceMember;
			IEnumerator var10_middleName;

			public Enumerator(seq2_join closure) {
				this.closure = closure;
			}

			public Object current() {return current;}

			public int position() {return pos;}

			public boolean moveNext() throws Exception {
				while (state != 0) {
					switch (state) {
						case 1: if (moveNext_1()) return true; break;
						case 2: if (moveNext_2()) return true; break;
						case 3: if (moveNext_3()) return true; break;
						case 4: if (moveNext_4()) return true; break;
						case 5: if (moveNext_5()) return true; break;
						case 6: if (moveNext_6()) return true; break;
						case 7: if (moveNext_7()) return true; break;
						case 8: if (moveNext_8()) return true; break;
						case 9: if (moveNext_9()) return true; break;
						case 10: if (moveNext_10()) return true; break;
						case 12: if (moveNext_12()) return true; break;
						case 13: if (moveNext_13()) return true; break;
						case 14: if (moveNext_14()) return true; break;
						case 15: if (moveNext_15()) return true; break;
						case 16: if (moveNext_16()) return true; break;
						case 17: if (moveNext_17()) return true; break;
						case 18: if (moveNext_18()) return true; break;
						case 19: if (moveNext_19()) return true; break;
						case 20: if (moveNext_20()) return true; break;
						case 21: if (moveNext_21()) return true; break;
					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				current = com.altova.functions.Core.createElement("XPN-1", (new seq3_join(closure.var1_ExamManagementEventN)));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 3;				
				var2_ExamManagementEventN = (closure.var1_ExamManagementEventN).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 5;				
				if (!var2_ExamManagementEventN.moveNext()) {state = 4; return false; }
				var3_ExamSchedulingReques = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ExamSchedulingRequestCreatedEvent", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var2_ExamManagementEventN.current())))).enumerator();
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 12;				
				if( var2_ExamManagementEventN != null ) { var2_ExamManagementEventN.close(); var2_ExamManagementEventN = null; }
				var6_ExamManagementEventN = (closure.var1_ExamManagementEventN).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 7;				
				if (!var3_ExamSchedulingReques.moveNext()) {state = 6; return false; }
				var4_PostDischargeClaimIn = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("PostDischargeClaimInformation", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var3_ExamSchedulingReques.current())))).enumerator();
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 3;				
				if( var3_ExamSchedulingReques != null ) { var3_ExamSchedulingReques.close(); var3_ExamSchedulingReques = null; }
				return false;
			}
			private boolean moveNext_7() throws Exception {
				state = 9;				
				if (!var4_PostDischargeClaimIn.moveNext()) {state = 8; return false; }
				var5_VeteranServiceMember = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("VeteranServiceMemberInfo", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var4_PostDischargeClaimIn.current())))).enumerator();
				return false;
			}
			private boolean moveNext_8() throws Exception {
				state = 5;				
				if( var4_PostDischargeClaimIn != null ) { var4_PostDischargeClaimIn.close(); var4_PostDischargeClaimIn = null; }
				return false;
			}
			private boolean moveNext_9() throws Exception {
				state = 9;				
				if (!var5_VeteranServiceMember.moveNext()) {state = 10; return false; }
				current = com.altova.functions.Core.createElement("XPN-2", com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("firstName", ""), ((com.altova.mapforce.IMFNode)(var5_VeteranServiceMember.current())))))));
				pos++;
				return true;
			}
			private boolean moveNext_10() throws Exception {
				state = 7;				
				if( var5_VeteranServiceMember != null ) { var5_VeteranServiceMember.close(); var5_VeteranServiceMember = null; }
				return false;
			}
			private boolean moveNext_12() throws Exception {
				state = 14;				
				if (!var6_ExamManagementEventN.moveNext()) {state = 13; return false; }
				var7_ExamSchedulingReques = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ExamSchedulingRequestCreatedEvent", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var6_ExamManagementEventN.current())))).enumerator();
				return false;
			}
			private boolean moveNext_13() throws Exception {
				state = 0;				
				if( var6_ExamManagementEventN != null ) { var6_ExamManagementEventN.close(); var6_ExamManagementEventN = null; }
				return false;
			}
			private boolean moveNext_14() throws Exception {
				state = 16;				
				if (!var7_ExamSchedulingReques.moveNext()) {state = 15; return false; }
				var8_PostDischargeClaimIn = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("PostDischargeClaimInformation", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var7_ExamSchedulingReques.current())))).enumerator();
				return false;
			}
			private boolean moveNext_15() throws Exception {
				state = 12;				
				if( var7_ExamSchedulingReques != null ) { var7_ExamSchedulingReques.close(); var7_ExamSchedulingReques = null; }
				return false;
			}
			private boolean moveNext_16() throws Exception {
				state = 18;				
				if (!var8_PostDischargeClaimIn.moveNext()) {state = 17; return false; }
				var9_VeteranServiceMember = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("VeteranServiceMemberInfo", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var8_PostDischargeClaimIn.current())))).enumerator();
				return false;
			}
			private boolean moveNext_17() throws Exception {
				state = 14;				
				if( var8_PostDischargeClaimIn != null ) { var8_PostDischargeClaimIn.close(); var8_PostDischargeClaimIn = null; }
				return false;
			}
			private boolean moveNext_18() throws Exception {
				state = 20;				
				if (!var9_VeteranServiceMember.moveNext()) {state = 19; return false; }
				var10_middleName = (com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("middleName", ""), ((com.altova.mapforce.IMFNode)(var9_VeteranServiceMember.current())))).enumerator();
				return false;
			}
			private boolean moveNext_19() throws Exception {
				state = 16;				
				if( var9_VeteranServiceMember != null ) { var9_VeteranServiceMember.close(); var9_VeteranServiceMember = null; }
				return false;
			}
			private boolean moveNext_20() throws Exception {
				state = 20;				
				if (!var10_middleName.moveNext()) {state = 21; return false; }
				current = com.altova.functions.Core.createElement("XPN-3", com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString(((com.altova.mapforce.IMFNode)(var10_middleName.current())))));
				pos++;
				return true;
			}
			private boolean moveNext_21() throws Exception {
				state = 18;				
				if( var10_middleName != null ) { var10_middleName.close(); var10_middleName = null; }
				return false;
			}


			public void close() {
				try {
					if( var5_VeteranServiceMember != null ) { var5_VeteranServiceMember.close(); var5_VeteranServiceMember = null; }
					if( var4_PostDischargeClaimIn != null ) { var4_PostDischargeClaimIn.close(); var4_PostDischargeClaimIn = null; }
					if( var3_ExamSchedulingReques != null ) { var3_ExamSchedulingReques.close(); var3_ExamSchedulingReques = null; }
					if( var2_ExamManagementEventN != null ) { var2_ExamManagementEventN.close(); var2_ExamManagementEventN = null; }
					if( var10_middleName != null ) { var10_middleName.close(); var10_middleName = null; }
					if( var9_VeteranServiceMember != null ) { var9_VeteranServiceMember.close(); var9_VeteranServiceMember = null; }
					if( var8_PostDischargeClaimIn != null ) { var8_PostDischargeClaimIn.close(); var8_PostDischargeClaimIn = null; }
					if( var7_ExamSchedulingReques != null ) { var7_ExamSchedulingReques.close(); var7_ExamSchedulingReques = null; }
					if( var6_ExamManagementEventN != null ) { var6_ExamManagementEventN.close(); var6_ExamManagementEventN = null; }
				} catch (Exception e) {
				}
			}
		}
	}
	static class seq3_join implements IEnumerable {
		com.altova.mapforce.IEnumerable var1_ExamManagementEventN;

		public seq3_join(com.altova.mapforce.IEnumerable var1_ExamManagementEventN)	{
			this.var1_ExamManagementEventN = var1_ExamManagementEventN;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}

		public static class Enumerator implements IEnumerator {
			int pos = 0;
			int state = 1;
			Object current;
			seq3_join closure;
			IEnumerator var2_ExamManagementEventN;
			IEnumerator var3_ExamSchedulingReques;
			IEnumerator var4_PostDischargeClaimIn;
			IEnumerator var5_VeteranServiceMember;

			public Enumerator(seq3_join closure) {
				this.closure = closure;
			}

			public Object current() {return current;}

			public int position() {return pos;}

			public boolean moveNext() throws Exception {
				while (state != 0) {
					switch (state) {
						case 1: if (moveNext_1()) return true; break;
						case 2: if (moveNext_2()) return true; break;
						case 3: if (moveNext_3()) return true; break;
						case 4: if (moveNext_4()) return true; break;
						case 5: if (moveNext_5()) return true; break;
						case 6: if (moveNext_6()) return true; break;
						case 7: if (moveNext_7()) return true; break;
						case 8: if (moveNext_8()) return true; break;
						case 9: if (moveNext_9()) return true; break;
					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_ExamManagementEventN = (closure.var1_ExamManagementEventN).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_ExamManagementEventN.moveNext()) {state = 3; return false; }
				var3_ExamSchedulingReques = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ExamSchedulingRequestCreatedEvent", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var2_ExamManagementEventN.current())))).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_ExamManagementEventN != null ) { var2_ExamManagementEventN.close(); var2_ExamManagementEventN = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_ExamSchedulingReques.moveNext()) {state = 5; return false; }
				var4_PostDischargeClaimIn = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("PostDischargeClaimInformation", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var3_ExamSchedulingReques.current())))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_ExamSchedulingReques != null ) { var3_ExamSchedulingReques.close(); var3_ExamSchedulingReques = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 8;				
				if (!var4_PostDischargeClaimIn.moveNext()) {state = 7; return false; }
				var5_VeteranServiceMember = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("VeteranServiceMemberInfo", "http://va.gov/vler/schemas/vlerSupersetSchema/examManagement/3.1"), ((com.altova.mapforce.IMFNode)(var4_PostDischargeClaimIn.current())))).enumerator();
				return false;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_PostDischargeClaimIn != null ) { var4_PostDischargeClaimIn.close(); var4_PostDischargeClaimIn = null; }
				return false;
			}
			private boolean moveNext_8() throws Exception {
				state = 8;				
				if (!var5_VeteranServiceMember.moveNext()) {state = 9; return false; }
				current = com.altova.functions.Core.createElement("FN-1", com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("lastName", ""), ((com.altova.mapforce.IMFNode)(var5_VeteranServiceMember.current())))))));
				pos++;
				return true;
			}
			private boolean moveNext_9() throws Exception {
				state = 6;				
				if( var5_VeteranServiceMember != null ) { var5_VeteranServiceMember.close(); var5_VeteranServiceMember = null; }
				return false;
			}


			public void close() {
				try {
					if( var5_VeteranServiceMember != null ) { var5_VeteranServiceMember.close(); var5_VeteranServiceMember = null; }
					if( var4_PostDischargeClaimIn != null ) { var4_PostDischargeClaimIn.close(); var4_PostDischargeClaimIn = null; }
					if( var3_ExamSchedulingReques != null ) { var3_ExamSchedulingReques.close(); var3_ExamSchedulingReques = null; }
					if( var2_ExamManagementEventN != null ) { var2_ExamManagementEventN.close(); var2_ExamManagementEventN = null; }
				} catch (Exception e) {
				}
			}
		}
	}
	static class Outer implements IEnumerable {
		com.altova.mapforce.IMFNode var1_ExamManagement_3_1_Instance;

		public Outer(com.altova.mapforce.IMFNode var1_ExamManagement_3_1_Instance)	{
			this.var1_ExamManagement_3_1_Instance = var1_ExamManagement_3_1_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}

		public static class Enumerator implements IEnumerator {
			int pos = 0;
			int state = 1;
			Object current;
			Outer closure;
			IEnumerator var2_ExamManagementEventN;

			public Enumerator(Outer closure) {
				this.closure = closure;
			}

			public Object current() {return current;}

			public int position() {return pos;}

			public boolean moveNext() throws Exception {
				while (state != 0) {
					switch (state) {
						case 1: if (moveNext_1()) return true; break;
						case 2: if (moveNext_2()) return true; break;
						case 3: if (moveNext_3()) return true; break;
					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_ExamManagementEventN = ((new main(closure.var1_ExamManagement_3_1_Instance))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_ExamManagementEventN.moveNext()) {state = 3; return false; }
				current = var2_ExamManagementEventN.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_ExamManagementEventN != null ) { var2_ExamManagementEventN.close(); var2_ExamManagementEventN = null; }
				return false;
			}


			public void close() {
				try {
					if( var2_ExamManagementEventN != null ) { var2_ExamManagementEventN.close(); var2_ExamManagementEventN = null; }
				} catch (Exception e) {
				}
			}
		}
	}


	// instances
	protected org.w3c.dom.Node varExamManagement_3_12Instance;

	public void run(String ExamManagement_3_12SourceFilename, String REF_I12TargetFilename) throws Exception {
		try(
			// open source streams
			com.altova.io.FileInput ExamManagement_3_12Source = new com.altova.io.FileInput(ExamManagement_3_12SourceFilename);
		// open target stream
			com.altova.io.FileOutput REF_I12Target = new com.altova.io.FileOutput(REF_I12TargetFilename);

		) {
			// run
			run(ExamManagement_3_12Source, REF_I12Target);

		}
	}


	// main entry point

	public void run(com.altova.io.Input ExamManagement_3_12Source, com.altova.io.Output REF_I12Target) throws Exception {
		// Open the source(s)
		writeTrace("Loading " + ExamManagement_3_12Source + "...\n");
		org.w3c.dom.Document doc_ExamManagement_3_12 = XmlTreeOperations.loadDocument(ExamManagement_3_12Source);
		varExamManagement_3_12Instance = doc_ExamManagement_3_12;
		if (runDoesCloseAll)
			ExamManagement_3_12Source.close();

		// Create the target
		com.bracari.services.mapforce.Envelope.EnvelopeDocument REF_I12TargetDoc = new com.bracari.services.mapforce.Envelope.EnvelopeDocument();
		com.altova.text.ITextNode REF_I12TargetObject = REF_I12TargetDoc.getGenerator();

		// Execute mapping

		main mapping = new main(new com.altova.xml.DOMDocumentAsMFNodeAdapter(varExamManagement_3_12Instance, ExamManagement_3_12Source.getFilename()));

		com.altova.text.MFTextWriter.write(mapping, REF_I12TargetObject);
		// Close the target
		REF_I12TargetDoc.setEncoding( "ISO-8859-1", false, false );
		REF_I12TargetDoc.save(REF_I12Target);


		if (runDoesCloseAll) {
			ExamManagement_3_12Source.close();
			REF_I12Target.close();
		}
	}



}