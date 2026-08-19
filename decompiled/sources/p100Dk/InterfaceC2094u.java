package p100Dk;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.withpersona.sdk2.inquiry.p689ui.network.AddressAutocompleteRequest;
import com.withpersona.sdk2.inquiry.p689ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.p689ui.network.OneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.p689ui.network.TransitionInquiryRequest;
import com.withpersona.sdk2.inquiry.steps.p688ui.network.AddressAutocompleteResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1027tp.C20048M;
import p1069vp.InterfaceC20666a;
import p1069vp.InterfaceC20671f;
import p1069vp.InterfaceC20674i;
import p1069vp.InterfaceC20680o;
import p1069vp.InterfaceC20684s;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Dk.u */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m18067d2 = {"LDk/u;", "", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "request", "Ltp/M;", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Lqm/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/AddressAutocompleteResponse;", "d", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;Lqm/c;)Ljava/lang/Object;", "addressId", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "e", "(Ljava/lang/String;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "a", "b", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface InterfaceC2094u {
    @InterfaceC20680o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-verify-popup-one-time-link-code")
    /* JADX INFO: renamed from: a */
    Object m3178a(@InterfaceC20684s("inquiryId") String str, @InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str2, InterfaceC18770c<? super C20048M<OneTimeLinkCodeResponse>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-create-popup-one-time-link-code")
    /* JADX INFO: renamed from: b */
    Object m3179b(@InterfaceC20684s("inquiryId") String str, @InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str2, InterfaceC18770c<? super C20048M<OneTimeLinkCodeResponse>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    /* JADX INFO: renamed from: c */
    Object m3180c(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("inquiryId") String str2, @InterfaceC20666a TransitionInquiryRequest transitionInquiryRequest, InterfaceC18770c<? super C20048M<Object>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/address/autocomplete")
    /* JADX INFO: renamed from: d */
    Object m3181d(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20666a AddressAutocompleteRequest addressAutocompleteRequest, InterfaceC18770c<? super C20048M<AddressAutocompleteResponse>> interfaceC18770c);

    @InterfaceC20671f("/api/internal/verify/v1/address/{addressId}")
    /* JADX INFO: renamed from: e */
    Object m3182e(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("addressId") String str2, InterfaceC18770c<? super C20048M<AddressDetailsResponse>> interfaceC18770c);
}
