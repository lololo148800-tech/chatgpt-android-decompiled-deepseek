package p003A1;

import android.content.res.Resources;
import android.os.Build;
import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p077Cn.C1743k;
import p077Cn.C1750r;
import p153Fn.AbstractC2923a;
import p492U1.C7538c;
import p693d1.C12988a;
import p729ej.AbstractC13422m;
import p759g1.C13803e;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: A1.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0289t extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1041Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0289t(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f1041Y = i12;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f1041Y) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.f32748K1;
                Resources resources = androidComposeView.getContext().getResources();
                C12988a c12988a = new C12988a(new C7538c(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((C13803e) obj2).f43598a, (InterfaceC1436k) obj3);
                if (Build.VERSION.SDK_INT >= 24) {
                    return Boolean.valueOf(C0215W.f817a.m685a(androidComposeView, null, c12988a));
                }
                throw null;
            case 1:
                InterfaceC1436k interfaceC1436k = ((C1743k) this.receiver).f4994Z;
                AbstractC16544l.m18091d(interfaceC1436k);
                AbstractC2923a.m3727a(interfaceC1436k, obj2, (InterfaceC18776i) obj3);
                return c17296c;
            case 2:
                Object obj4 = ((C1750r) obj2).f5021a;
                InterfaceC1436k interfaceC1436k2 = ((C1743k) this.receiver).f4994Z;
                AbstractC16544l.m18091d(interfaceC1436k2);
                Object objM2560b = C1750r.m2560b(obj4);
                AbstractC16544l.m18091d(objM2560b);
                AbstractC2923a.m3727a(interfaceC1436k2, objM2560b, (InterfaceC18776i) obj3);
                return c17296c;
            default:
                return ((AbstractC13422m) this.receiver).mo8937b(obj, obj2, obj3);
        }
    }
}
