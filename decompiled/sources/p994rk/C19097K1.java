package p994rk;

import android.content.Context;
import android.os.Parcelable;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import hk.C14525c;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0675i;
import p1075w5.C20835m;
import p1113xn.C21307a;
import p864l5.C16826m;
import p899n5.C17498o;
import p899n5.C17500q;
import p899n5.C17503t;
import p899n5.InterfaceC17490g;
import p899n5.InterfaceC17491h;
import p958q5.C18638m;

/* JADX INFO: renamed from: rk.K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19097K1 implements InterfaceC17490g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60786a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Parcelable f60787b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f60788c;

    public /* synthetic */ C19097K1(Parcelable parcelable, Object obj, int i10) {
        this.f60786a = i10;
        this.f60787b = parcelable;
        this.f60788c = obj;
    }

    @Override // p899n5.InterfaceC17490g
    /* JADX INFO: renamed from: a */
    public final InterfaceC17491h mo19195a(C18638m result, C20835m options, C16826m c16826m) {
        switch (this.f60786a) {
            case 0:
                ImageView imageView = (ImageView) this.f60788c;
                AbstractC16544l.m18094g(result, "result");
                AbstractC16544l.m18094g(options, "options");
                byte[] bArrMo1343K = result.f59376a.mo19197O0().mo1343K();
                Charset charset = C21307a.f67720a;
                byte[] bytes = AbstractC19120S1.m20301a(new String(bArrMo1343K, charset), (UiComponentConfig.RemoteImageComponentStyle) this.f60787b).getBytes(charset);
                AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
                C0675i c0675i = new C0675i();
                c0675i.m1433d1(bytes);
                Context context = imageView.getContext();
                AbstractC16544l.m18093f(context, "getContext(...)");
                return new C17503t(new C17500q(c0675i, new C17498o(context, 1), null), options, true);
            default:
                C19094J1 this_remoteImageFromBundledResource = (C19094J1) this.f60787b;
                AbstractC16544l.m18094g(this_remoteImageFromBundledResource, "$this_remoteImageFromBundledResource");
                C14525c c14525c = (C14525c) this.f60788c;
                AbstractC16544l.m18094g(result, "result");
                AbstractC16544l.m18094g(options, "options");
                byte[] bArrMo1343K2 = result.f59376a.mo19197O0().mo1343K();
                Charset charset2 = C21307a.f67720a;
                byte[] bytes2 = AbstractC19120S1.m20301a(new String(bArrMo1343K2, charset2), this_remoteImageFromBundledResource.f60779Y.getStyles()).getBytes(charset2);
                AbstractC16544l.m18093f(bytes2, "this as java.lang.String).getBytes(charset)");
                C0675i c0675i2 = new C0675i();
                c0675i2.m1433d1(bytes2);
                Context context2 = ((ImageView) c14525c.f45778c).getContext();
                AbstractC16544l.m18093f(context2, "getContext(...)");
                return new C17503t(new C17500q(c0675i2, new C17498o(context2, 1), null), options, true);
        }
    }
}
