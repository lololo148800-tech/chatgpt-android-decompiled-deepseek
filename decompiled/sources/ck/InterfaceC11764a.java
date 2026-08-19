package ck;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
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

/* JADX INFO: renamed from: ck.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m18067d2 = {"Lck/a;", "", "", "sessionToken", "inquiryId", "", "Lmo/t;", "body", "Ltp/M;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lqm/c;)Ljava/lang/Object;", "selfie_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface InterfaceC11764a {
    @InterfaceC20677l
    @InterfaceC20676k({"Accept: multipart/form-data"})
    @InterfaceC20680o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    /* JADX INFO: renamed from: a */
    Object m13057a(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("inquiryId") String str2, @InterfaceC20682q List<C17353t> list, InterfaceC18770c<? super C20048M<?>> interfaceC18770c);
}
