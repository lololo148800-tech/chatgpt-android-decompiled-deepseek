package p1039ud;

import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModel;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p080D0.AbstractC1783Q;
import p080D0.C1782P;
import p080D0.InterfaceC1818n;
import p1044uj.AbstractC20337g0;
import p1044uj.AbstractC20340i;
import p1044uj.AbstractC20358r;
import p1044uj.C20311M;
import p1044uj.C20319V;
import p1044uj.C20323Z;
import p1044uj.C20329c0;
import p1044uj.C20338h;
import p1044uj.EnumC20327b0;
import p1044uj.EnumC20335f0;
import p1062vd.C20536P;
import p1062vd.C20549b0;
import p1062vd.InterfaceC20563m;
import p1071w0.C20706E0;
import p1071w0.EnumC20729S;
import p1087wj.AbstractC20975F;
import p1087wj.AbstractC20982c;
import p1087wj.AbstractC21004y;
import p1087wj.C20973D;
import p1087wj.C20981b;
import p1087wj.C21002w;
import p1095x1.C21053G;
import p1095x1.C21094o;
import p1095x1.InterfaceC21077c0;
import p1139z0.C21616g0;
import p1139z0.InputConnectionC21594Q;
import p1140z1.AbstractC21678Y;
import p1140z1.C21659E;
import p1140z1.InterfaceC21680a;
import p1143z4.AbstractC21769K;
import p1143z4.AbstractC21790t;
import p1143z4.C21759A;
import p1143z4.C21778h;
import p1143z4.C21780j;
import p1143z4.C21783m;
import p1143z4.C21786p;
import p1143z4.C21795y;
import p1156zj.AbstractC22208y0;
import p1156zj.C22130W0;
import p1156zj.C22175m1;
import p156G1.C2963j;
import p349O0.C5994b0;
import p350O1.InterfaceC6060i;
import p693d1.C12989b;
import p729ej.C13430u;
import p796i0.C14894a;
import p846k4.C16340i;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: ud.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C20198o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63964Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f63965Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20198o(Object obj, int i10) {
        super(1);
        this.f63964Y = i10;
        this.f63965Z = obj;
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [x1.X, z1.a] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f63964Y) {
            case 0:
                return ((InterfaceC20563m) ((C20194k) this.f63965Z).f63951f.get(((Number) obj).intValue())).getId();
            case 1:
                AbstractC20340i it = (AbstractC20340i) obj;
                AbstractC16544l.m18094g(it, "it");
                if (it instanceof C20338h) {
                    ((C20323Z) this.f63965Z).f64249m.invoke(it);
                }
                return C17296C.f55119a;
            case 2:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                if (obj2 instanceof C20329c0) {
                    action.f42521b = AbstractC20337g0.m21039c((AbstractC20337g0) obj2, EnumC20335f0.f64298o0, null, null, ((C20311M) ((AbstractC20358r) this.f63965Z)).f64198b, 6);
                }
                return C17296C.f55119a;
            case 3:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.m14964a(new C20319V(((C21002w) ((AbstractC21004y) this.f63965Z)).f66850a));
                return C17296C.f55119a;
            case 4:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                action3.m14964a(new C20319V(((C20973D) ((AbstractC20975F) this.f63965Z)).f66785a));
                return C17296C.f55119a;
            case 5:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                action4.f42521b = ((AbstractC20337g0) this.f63965Z).m21040a(EnumC20327b0.f64267Y);
                return C17296C.f55119a;
            case 6:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                action5.f42521b = AbstractC20337g0.m21039c((AbstractC20337g0) action5.f42521b, EnumC20335f0.f64299p0, ((C20981b) ((AbstractC20982c) this.f63965Z)).f66805a, null, null, 12);
                return C17296C.f55119a;
            case 7:
                return ((InterfaceC20563m) ((C20549b0) this.f63965Z).f65208E.get(((Number) obj).intValue())).getId();
            case 8:
                String it2 = (String) obj;
                AbstractC16544l.m18094g(it2, "it");
                ((GizmosAndHistoryViewModel) this.f63965Z).m14395k(new C20536P(it2));
                return C17296C.f55119a;
            case 9:
                ((C2963j) obj).m3787m(AbstractC1783Q.f5106c, new C1782P(EnumC20729S.f65724Y, ((InterfaceC1818n) this.f63965Z).mo2571a(), 2, true));
                return C17296C.f55119a;
            case 10:
                float fFloatValue = ((Number) obj).floatValue();
                C20706E0 c20706e0 = (C20706E0) this.f63965Z;
                float fM6409g = c20706e0.f65619a.m6409g() + fFloatValue;
                C5994b0 c5994b0 = c20706e0.f65620b;
                float fM6409g2 = c5994b0.m6409g();
                C5994b0 c5994b1 = c20706e0.f65619a;
                if (fM6409g > fM6409g2) {
                    fFloatValue = c5994b0.m6409g() - c5994b1.m6409g();
                } else if (fM6409g < 0.0f) {
                    fFloatValue = -c5994b1.m6409g();
                }
                c5994b1.m6410h(c5994b1.m6409g() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 11:
                OutputStream it3 = (OutputStream) obj;
                AbstractC16544l.m18094g(it3, "it");
                it3.write((byte[]) this.f63965Z);
                return C17296C.f55119a;
            case 12:
                OutputStream os = (OutputStream) obj;
                AbstractC16544l.m18094g(os, "os");
                ((Bitmap) this.f63965Z).compress(Bitmap.CompressFormat.JPEG, 90, os);
                return C17296C.f55119a;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                InterfaceC21077c0 interfaceC21077c0 = (InterfaceC21077c0) entry.getValue();
                C21053G c21053g = (C21053G) this.f63965Z;
                int iM7107l = c21053g.f66967y0.m7107l(key);
                if (iM7107l < 0 || iM7107l >= c21053g.f66959q0) {
                    interfaceC21077c0.dispose();
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 14:
                ((InputConnectionC21594Q) this.f63965Z).m21940a((InterfaceC6060i) obj);
                return C17296C.f55119a;
            case 15:
                ClipDescription clipDescription = ((C12989b) obj).f41241a.getClipDescription();
                Iterable<C14894a> iterable = (Iterable) ((C21616g0) this.f63965Z).invoke();
                boolean z10 = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (C14894a c14894a : iterable) {
                        if (AbstractC16544l.m18089b(c14894a, C14894a.f46385c) || clipDescription.hasMimeType(c14894a.f46386a)) {
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 16:
                InterfaceC21680a interfaceC21680a = (InterfaceC21680a) obj;
                if (interfaceC21680a.mo22083A()) {
                    if (interfaceC21680a.mo22087a().f68665b) {
                        interfaceC21680a.mo22097z();
                    }
                    Iterator it4 = interfaceC21680a.mo22087a().f68672i.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it4.hasNext();
                        C21659E c21659e = (C21659E) this.f63965Z;
                        if (zHasNext) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            C21659E.m22072a(c21659e, (C21094o) entry2.getKey(), ((Number) entry2.getValue()).intValue(), interfaceC21680a.mo22090f());
                        } else {
                            AbstractC21678Y abstractC21678Y = interfaceC21680a.mo22090f().f68821z0;
                            AbstractC16544l.m18091d(abstractC21678Y);
                            while (!abstractC21678Y.equals(c21659e.f68664a.mo22090f())) {
                                for (C21094o c21094o : c21659e.m22073b(abstractC21678Y).keySet()) {
                                    C21659E.m22072a(c21659e, c21094o, c21659e.m22074c(abstractC21678Y, c21094o), abstractC21678Y);
                                }
                                abstractC21678Y = abstractC21678Y.f68821z0;
                                AbstractC16544l.m18091d(abstractC21678Y);
                            }
                        }
                    }
                }
                return C17296C.f55119a;
            case 17:
                String key2 = (String) obj;
                AbstractC16544l.m18094g(key2, "key");
                C21786p c21786p = (C21786p) this.f63965Z;
                ArrayList arrayList = c21786p.f69108b;
                Collection collectionValues = ((Map) c21786p.f69112f.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    AbstractC17686t.m19398v(((C21783m) it5.next()).f69100b, arrayList2);
                }
                return Boolean.valueOf(!AbstractC17680n.m19361k0((List) c21786p.f69115i.getValue(), AbstractC17680n.m19361k0(arrayList2, arrayList)).contains(key2));
            case 18:
                C21778h backStackEntry = (C21778h) obj;
                AbstractC16544l.m18094g(backStackEntry, "backStackEntry");
                AbstractC21790t abstractC21790t = backStackEntry.f69074Z;
                if (!(abstractC21790t instanceof AbstractC21790t)) {
                    abstractC21790t = null;
                }
                if (abstractC21790t == null) {
                    return null;
                }
                backStackEntry.m22263d();
                AbstractC21769K abstractC21769K = (AbstractC21769K) this.f63965Z;
                AbstractC21790t abstractC21790tMo22259c = abstractC21769K.mo22259c(abstractC21790t);
                if (abstractC21790tMo22259c == null) {
                    backStackEntry = null;
                } else if (!abstractC21790tMo22259c.equals(abstractC21790t)) {
                    C21780j c21780jM22258b = abstractC21769K.m22258b();
                    Bundle bundleM22279j = abstractC21790tMo22259c.m22279j(backStackEntry.m22263d());
                    C21795y c21795y = c21780jM22258b.f69096h;
                    backStackEntry = C16340i.m17935i(c21795y.f33529a, abstractC21790tMo22259c, bundleM22279j, c21795y.m12191k(), c21795y.f33545q);
                }
                return backStackEntry;
            case 19:
                C22130W0 idClass = (C22130W0) obj;
                AbstractC16544l.m18094g(idClass, "idClass");
                ((C22175m1) this.f63965Z).f70222h.invoke(idClass);
                return C17296C.f55119a;
            default:
                C13430u action6 = (C13430u) obj;
                AbstractC16544l.m18094g(action6, "$this$action");
                action6.m14964a((AbstractC22208y0) this.f63965Z);
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20198o(AbstractC21769K abstractC21769K, C21759A c21759a) {
        super(1);
        this.f63964Y = 18;
        this.f63965Z = abstractC21769K;
    }
}
