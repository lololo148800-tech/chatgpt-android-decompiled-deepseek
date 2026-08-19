package p342Nj;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mo.AbstractC17329F;
import p1027tp.C20048M;
import p1069vp.InterfaceC20666a;
import p1069vp.InterfaceC20671f;
import p1069vp.InterfaceC20674i;
import p1069vp.InterfaceC20679n;
import p1069vp.InterfaceC20680o;
import p1069vp.InterfaceC20684s;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Nj.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000f\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u000e\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m18067d2 = {"LNj/j;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "request", "Ltp/M;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "e", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Lqm/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "", "deviceId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "b", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "sessionToken", "inquiryId", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "Lmo/F;", "f", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lqm/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lqm/c;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "g", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lqm/c;)Ljava/lang/Object;", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface InterfaceC5816j {
    @InterfaceC20680o("/api/internal/verify/v1/current-inquiry-session/cancel")
    /* JADX INFO: renamed from: a */
    Object m6208a(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, InterfaceC18770c<? super C20048M<AbstractC17329F>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/inquiry-sessions")
    /* JADX INFO: renamed from: b */
    Object m6209b(@InterfaceC20666a CreateInquirySessionRequest createInquirySessionRequest, @InterfaceC20674i("Persona-Device-Id") String str, InterfaceC18770c<? super C20048M<CreateInquirySessionResponse>> interfaceC18770c);

    @InterfaceC20671f("/api/internal/verify/v1/inquiries/{inquiryId}")
    /* JADX INFO: renamed from: c */
    Object m6210c(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20674i("Persona-Device-Id") String str2, @InterfaceC20684s("inquiryId") String str3, InterfaceC18770c<? super C20048M<CheckInquiryResponse>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    /* JADX INFO: renamed from: d */
    Object m6211d(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("inquiryId") String str2, @InterfaceC20666a TransitionBackRequest transitionBackRequest, InterfaceC18770c<? super C20048M<CheckInquiryResponse>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/inquiries")
    /* JADX INFO: renamed from: e */
    Object m6212e(@InterfaceC20666a CreateInquiryRequest createInquiryRequest, InterfaceC18770c<? super C20048M<CheckInquiryResponse>> interfaceC18770c);

    @InterfaceC20679n("/api/internal/verify/v1/current-inquiry-session")
    /* JADX INFO: renamed from: f */
    Object m6213f(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20666a UpdateInquirySessionRequest updateInquirySessionRequest, InterfaceC18770c<? super C20048M<AbstractC17329F>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/current-inquiry-session/error")
    /* JADX INFO: renamed from: g */
    Object m6214g(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20666a ErrorRequest errorRequest, InterfaceC18770c<? super C20048M<AbstractC17329F>> interfaceC18770c);
}
