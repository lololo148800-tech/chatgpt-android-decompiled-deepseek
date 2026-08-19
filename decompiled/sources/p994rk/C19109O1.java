package p994rk;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.widget.ImageView;
import fk.EnumC13687h;
import hk.C14525c;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1075w5.C20830h;
import p1110xk.AbstractC21284g;
import p571X9.AbstractC9306j0;
import p791hj.C14522e;
import p864l5.C16826m;

/* JADX INFO: renamed from: rk.O1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19109O1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60808Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19094J1 f60809Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16556x f60810o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f60811p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f60812q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19109O1(C14525c c14525c, C19094J1 c19094j1, C16556x c16556x, Context context, int i10) {
        super(0);
        this.f60808Y = c14525c;
        this.f60809Z = c19094j1;
        this.f60810o0 = c16556x;
        this.f60811p0 = context;
        this.f60812q0 = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int i10 = 1;
        C14525c c14525c = this.f60808Y;
        ImageView imageView = (ImageView) c14525c.f45778c;
        C19094J1 c19094j1 = this.f60809Z;
        AbstractC21284g.m21627c(imageView, c19094j1.f60779Y);
        boolean z6 = this.f60810o0.f51285Y;
        int i11 = this.f60812q0;
        if (z6) {
            Context context = imageView.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            C16826m c16826mM16016g = new C14522e(context).m16016g();
            Context context2 = this.f60811p0;
            String resourcePackageName = context2.getResources().getResourcePackageName(i11);
            EnumC13687h enumC13687h = EnumC13687h.f43182Y;
            String lowerCase = "Raw".toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String resourceEntryName = context2.getResources().getResourceEntryName(i11);
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("android.resource://", resourcePackageName, Separators.SLASH, lowerCase, Separators.SLASH);
            sbM9896o.append(resourceEntryName);
            Uri uri = Uri.parse(sbM9896o.toString());
            C20830h c20830h = new C20830h(imageView.getContext());
            c20830h.f66187c = uri;
            c20830h.m21438d(imageView);
            c20830h.f66191g = new C19097K1(c19094j1, c14525c, i10);
            c16826mM16016g.m18564b(c20830h.m21435a());
        } else {
            imageView.setImageResource(i11);
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setAdjustViewBounds(true);
        return C17296C.f55119a;
    }
}
