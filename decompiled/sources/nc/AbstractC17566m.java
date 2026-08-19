package nc;

import android.content.Context;
import android.os.Trace;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import io.ktor.client.plugins.auth.C15058c;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p042Bf.C1281w;
import p1075w5.C20830h;
import p1075w5.C20831i;
import p1095x1.C21088i;
import p1095x1.C21089j;
import p1098x5.C21126e;
import p1098x5.C21129h;
import p1144z5.C21797a;
import p349O0.C5984W0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p635a1.C10444b;
import p635a1.InterfaceC10459q;
import p791hj.C14522e;
import p864l5.C16814a;
import p864l5.C16826m;
import p864l5.InterfaceC16818e;
import p886m5.AbstractC17172g;
import p886m5.AbstractC17173h;
import p886m5.AbstractC17174i;
import p911o0.AbstractC17758g;

/* JADX INFO: renamed from: nc.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17566m {

    /* JADX INFO: renamed from: a */
    public static final float f56205a = 64;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public static final void m19217a(String url, String str, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C16826m c16826m;
        C21088i c21088i = C21089j.f67013p0;
        AbstractC16544l.m18094g(url, "url");
        c6021p.m6526U(-980895233);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(url) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c6021p.m6542f(c21088i) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5984W0 c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
            C20830h c20830h = new C20830h((Context) c6021p.m6548k(c5984w0));
            c20830h.f66187c = url;
            c20830h.f66201q = new C21126e(C21129h.f67131c);
            c20830h.m21436b();
            c20830h.f66193i = new C21797a(100);
            C20831i c20831iM21435a = c20830h.m21435a();
            c6021p.m6525T(-1494234083);
            C15058c c15058c = AsyncImagePainter.f35871G0;
            C21088i c21088i2 = C21089j.f67012o0;
            InterfaceC16818e interfaceC16818e = (InterfaceC16818e) c6021p.m6548k(AbstractC17173h.f54857a);
            InterfaceC16818e interfaceC16818e2 = interfaceC16818e;
            if (interfaceC16818e == null) {
                Context context = (Context) c6021p.m6548k(c5984w0);
                c16826m = C16814a.f53951b;
                if (c16826m == null) {
                    interfaceC16818e2 = c16826m;
                    synchronized (C16814a.f53950a) {
                        C16826m c16826m2 = C16814a.f53951b;
                        interfaceC16818e2 = c16826m2;
                        if (c16826m2 == null) {
                            context.getApplicationContext();
                            C16826m c16826mM16016g = new C14522e(context).m16016g();
                            C16814a.f53951b = c16826mM16016g;
                            interfaceC16818e2 = c16826mM16016g;
                        }
                    }
                }
            }
            interfaceC16818e2 = c16826m;
            c6021p.m6525T(1645646697);
            c6021p.m6525T(952940650);
            Trace.beginSection("rememberAsyncImagePainter");
            try {
                int i12 = AbstractC17174i.f54858a;
                c6021p.m6525T(1087186730);
                c6021p.m6553p(false);
                AbstractC17172g.m18922b(c20831iM21435a);
                c6021p.m6525T(1094691773);
                Object objM6514H = c6021p.m6514H();
                if (objM6514H == C6013l.f19514a) {
                    objM6514H = new AsyncImagePainter(c20831iM21435a, interfaceC16818e2);
                    c6021p.m6537c0(objM6514H);
                }
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objM6514H;
                c6021p.m6553p(false);
                asyncImagePainter.f35885y0 = c15058c;
                asyncImagePainter.f35886z0 = null;
                asyncImagePainter.f35872A0 = c21088i2;
                asyncImagePainter.f35873B0 = 1;
                asyncImagePainter.f35874C0 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                asyncImagePainter.f35877F0.setValue(interfaceC16818e2);
                asyncImagePainter.f35876E0.setValue(c20831iM21435a);
                asyncImagePainter.mo2151d();
                c6021p.m6553p(false);
                Trace.endSection();
                c6021p.m6553p(false);
                c6021p.m6553p(false);
                AbstractC17758g.m19481a(interfaceC10459q, C10444b.f30938q0, false, AbstractC8411c.m8968b(-1906883371, c6021p, new C1281w((InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f), asyncImagePainter, str, 25)), c6021p, ((i11 >> 6) & 14) | 3120, 4);
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(url, str, interfaceC10459q, i10, 17);
        }
    }
}
