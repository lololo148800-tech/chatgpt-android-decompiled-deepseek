package p149Fj;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$SupplementaryData;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mo.C17353t;
import p1027tp.C20048M;
import p1069vp.InterfaceC20674i;
import p1069vp.InterfaceC20676k;
import p1069vp.InterfaceC20677l;
import p1069vp.InterfaceC20680o;
import p1069vp.InterfaceC20682q;
import p1069vp.InterfaceC20684s;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Fj.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJG\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m18067d2 = {"LFj/o;", "", "", "sessionToken", "inquiryId", "", "Lmo/t;", "body", "Ltp/M;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lqm/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "LFj/b;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;Lqm/c;)Ljava/lang/Object;", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface InterfaceC2881o {
    @InterfaceC20677l
    @InterfaceC20676k({"Accept: multipart/form-data"})
    @InterfaceC20680o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    /* JADX INFO: renamed from: a */
    Object m3719a(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("inquiryId") String str2, @InterfaceC20682q List<C17353t> list, InterfaceC18770c<? super C20048M<?>> interfaceC18770c);

    @InterfaceC20677l
    @InterfaceC20676k({"Accept: multipart/form-data"})
    @InterfaceC20680o("/api/internal/verify/v1/inquiries/{inquiryId}/government-id-classification")
    /* JADX INFO: renamed from: b */
    Object m3720b(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("inquiryId") String str2, @InterfaceC20682q List<C17353t> list, @InterfaceC20682q("data[attributes][files][][supplementary_data]") AutoClassifyWorker$SupplementaryData autoClassifyWorker$SupplementaryData, InterfaceC18770c<? super C20048M<InterfaceC2868b>> interfaceC18770c);
}
