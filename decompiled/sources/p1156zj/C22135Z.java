package p1156zj;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C22135Z extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C22135Z f69973Z = new C22135Z(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C22135Z f69974o0 = new C22135Z(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C22135Z f69975p0 = new C22135Z(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69976Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22135Z(int i10, int i11) {
        super(i10);
        this.f69976Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69976Y) {
            case 0:
                AbstractC16544l.m18094g((List) obj, "<anonymous parameter 0>");
                AbstractC16544l.m18094g((C18428A) obj2, "<anonymous parameter 1>");
                break;
            case 1:
                AbstractC16544l.m18094g((List) obj, "<anonymous parameter 0>");
                AbstractC16544l.m18094g((C18428A) obj2, "<anonymous parameter 1>");
                break;
            default:
                AbstractC16544l.m18094g((File) obj, "<anonymous parameter 0>");
                AbstractC16544l.m18094g((C18428A) obj2, "<anonymous parameter 1>");
                break;
        }
        return C17296C.f55119a;
    }
}
