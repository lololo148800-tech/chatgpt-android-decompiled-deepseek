package p1087wj;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadResponse;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mo.C17353t;
import p1027tp.C20048M;
import p1069vp.InterfaceC20666a;
import p1069vp.InterfaceC20667b;
import p1069vp.InterfaceC20671f;
import p1069vp.InterfaceC20674i;
import p1069vp.InterfaceC20676k;
import p1069vp.InterfaceC20677l;
import p1069vp.InterfaceC20680o;
import p1069vp.InterfaceC20682q;
import p1069vp.InterfaceC20684s;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: wj.B */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\fJ5\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m18067d2 = {"Lwj/B;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "request", "Ltp/M;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;Lqm/c;)Ljava/lang/Object;", "documentId", "e", "(Ljava/lang/String;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "", "Lmo/t;", "document", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "d", "(Ljava/lang/String;Ljava/util/List;Lqm/c;)Ljava/lang/Object;", "fileId", "a", "inquiryId", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;Lqm/c;)Ljava/lang/Object;", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface InterfaceC20971B {
    @InterfaceC20667b("/api/internal/verify/v1/document-files/{fileId}")
    /* JADX INFO: renamed from: a */
    Object m21457a(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("fileId") String str2, InterfaceC18770c<? super C20048M<?>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    /* JADX INFO: renamed from: b */
    Object m21458b(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("inquiryId") String str2, @InterfaceC20666a SubmitDocumentRequest submitDocumentRequest, InterfaceC18770c<? super C20048M<?>> interfaceC18770c);

    @InterfaceC20680o("/api/internal/verify/v1/documents")
    /* JADX INFO: renamed from: c */
    Object m21459c(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20666a CreateDocumentRequest createDocumentRequest, InterfaceC18770c<? super C20048M<CreateDocumentResponse>> interfaceC18770c);

    @InterfaceC20677l
    @InterfaceC20676k({"Accept: multipart/form-data"})
    @InterfaceC20680o("/api/internal/verify/v1/document-files")
    /* JADX INFO: renamed from: d */
    Object m21460d(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20682q List<C17353t> list, InterfaceC18770c<? super C20048M<DocumentFileUploadResponse>> interfaceC18770c);

    @InterfaceC20671f("/api/internal/verify/v1/documents/{documentId}")
    /* JADX INFO: renamed from: e */
    Object m21461e(@InterfaceC20674i(SIPHeaderNames.AUTHORIZATION) String str, @InterfaceC20684s("documentId") String str2, InterfaceC18770c<? super C20048M<CreateDocumentResponse>> interfaceC18770c);
}
