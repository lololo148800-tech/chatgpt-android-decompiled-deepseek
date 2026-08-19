package p1108xi;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import bo.AbstractC11516d;
import bo.C11515c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17296C;
import p001A.AbstractC0010F;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1113xn.C21307a;
import p195Hh.C3430e;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xi.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C21274k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f67656Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ WebView f67657Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f67658o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f67659p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3430e f67660q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f67661r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f67662s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21274k(String str, WebView webView, String str2, InterfaceC5985X interfaceC5985X, C3430e c3430e, InterfaceC5985X interfaceC5985X2, InterfaceC5985X interfaceC5985X3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67656Y = str;
        this.f67657Z = webView;
        this.f67658o0 = str2;
        this.f67659p0 = interfaceC5985X;
        this.f67660q0 = c3430e;
        this.f67661r0 = interfaceC5985X2;
        this.f67662s0 = interfaceC5985X3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C21274k(this.f67656Y, this.f67657Z, this.f67658o0, this.f67659p0, this.f67660q0, this.f67661r0, this.f67662s0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21274k c21274k = (C21274k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21274k.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean zBooleanValue = ((Boolean) this.f67659p0.getValue()).booleanValue();
        C17296C c17296c = C17296C.f55119a;
        if (!zBooleanValue) {
            return c17296c;
        }
        byte[] bytes = this.f67656Y.getBytes(C21307a.f67720a);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.f67658o0;
        if (str == null) {
            str = "unknown";
        }
        String strM20d = AbstractC0010F.m20d("highlightCode('", str, "', '", strEncodeToString, "')");
        final InterfaceC5985X interfaceC5985X = this.f67661r0;
        final InterfaceC5985X interfaceC5985X2 = this.f67662s0;
        final C3430e c3430e = this.f67660q0;
        final String str2 = this.f67658o0;
        this.f67657Z.evaluateJavascript(strM20d, new ValueCallback() { // from class: xi.j
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj2) {
                InterfaceC5985X interfaceC5985X3 = interfaceC5985X2;
                String str3 = (String) obj2;
                interfaceC5985X.setValue(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                boolean zM18089b = AbstractC16544l.m18089b(str3, "null");
                C3430e c3430e2 = c3430e;
                String str4 = str2;
                if (zM18089b) {
                    AbstractC8160o6.m8727b(c3430e2, AbstractC10763a.m11054l("Javascript syntax highlighting returned null for ", str4, Separators.DOT), null, 6);
                    return;
                }
                try {
                    C11515c c11515c = AbstractC11516d.f34842d;
                    KSerializer kSerializerSerializer = C21270g.Companion.serializer();
                    AbstractC16544l.m18091d(str3);
                    interfaceC5985X3.setValue((C21270g) c11515c.m12903b(str3, kSerializerSerializer));
                } catch (Exception e10) {
                    AbstractC8160o6.m8727b(c3430e2, "Error decoding syntax highlighting for " + str4, e10, 4);
                }
            }
        });
        return c17296c;
    }
}
