package p1044uj;

import android.content.Context;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1087wj.AbstractC20994o;
import p1087wj.C20990k;
import p729ej.C13430u;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: uj.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20357q0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20336g f64361Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC20337g0 f64362Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC20994o f64363o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20359r0 f64364p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20357q0(C20336g c20336g, AbstractC20337g0 abstractC20337g0, AbstractC20994o abstractC20994o, C20359r0 c20359r0) {
        super(1);
        this.f64361Y = c20336g;
        this.f64362Z = abstractC20337g0;
        this.f64363o0 = abstractC20994o;
        this.f64364p0 = c20359r0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        EnumC20335f0 enumC20335f0;
        String string;
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        ArrayList arrayListM19357g0 = AbstractC17680n.m19357g0(((AbstractC20337g0) action.f42521b).mo21035g(), this.f64361Y);
        if (!arrayListM19357g0.isEmpty()) {
            Iterator it = arrayListM19357g0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    enumC20335f0 = EnumC20335f0.f64299p0;
                    break;
                }
                if (((AbstractC20340i) it.next()) instanceof C20336g) {
                    enumC20335f0 = EnumC20335f0.f64297Z;
                    break;
                }
            }
        } else {
            enumC20335f0 = EnumC20335f0.f64299p0;
            break;
        }
        EnumC20335f0 enumC20335f1 = enumC20335f0;
        String strMo21034f = this.f64362Z.mo21034f();
        EnumC20327b0 enumC20327b0 = EnumC20327b0.f64267Y;
        GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse = ((C20990k) this.f64363o0).f66822a;
        Context context = this.f64364p0.f64367b;
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError) {
            GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError disabledFileTypeError = (GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError) documentErrorResponse;
            string = context.getString(R.string.pi2_document_error_disabled_file_type, disabledFileTypeError.getDetails().getUploadedFileType(), AbstractC17680n.m19349Y(disabledFileTypeError.getDetails().getEnabledFileTypes(), ", ", null, null, 0, null, null, 62));
            AbstractC16544l.m18093f(string, "getString(...)");
        } else if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError) {
            string = context.getString(R.string.pi2_document_error_file_limit_exceeded);
            AbstractC16544l.m18093f(string, "getString(...)");
        } else if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError) {
            string = context.getString(R.string.pi2_document_error_page_limit_exceeded, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError) documentErrorResponse).getDetails().getPageLimit()));
            AbstractC16544l.m18093f(string, "getString(...)");
        } else if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError) {
            string = context.getString(R.string.pi2_document_error_malformed_image_or_file);
            AbstractC16544l.m18093f(string, "getString(...)");
        } else if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError) {
            string = context.getString(R.string.pi2_document_error_malformed_image_or_file);
            AbstractC16544l.m18093f(string, "getString(...)");
        } else if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError) {
            string = context.getString(R.string.pi2_document_error_malformed_pdf);
            AbstractC16544l.m18093f(string, "getString(...)");
        } else if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            string = context.getString(R.string.pi2_document_error_government_id_min_dimension_size, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) documentErrorResponse).getDetails().getMinDimensionSize()));
            AbstractC16544l.m18093f(string, "getString(...)");
        } else {
            if (!(documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError)) {
                throw new C0644w();
            }
            string = context.getString(R.string.pi2_document_error_unable_to_add_file);
            AbstractC16544l.m18093f(string, "getString(...)");
        }
        action.f42521b = new C20329c0(arrayListM19357g0, strMo21034f, enumC20327b0, enumC20335f1, false, string, 80);
        return C17296C.f55119a;
    }
}
