package p1042uh;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p009A7.FlM.nkFZpTrMPpn;
import p1006s6.InterfaceC19456f;
import p1129yh.C21541a;
import p1154zh.AbstractC21890a;
import p909nm.AbstractC17681o;
import p917o6.AbstractC17850c;
import p917o6.C17839G;
import p917o6.C17849b;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;

/* JADX INFO: renamed from: uh.M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20249M implements InterfaceC17848a {

    /* JADX INFO: renamed from: Y */
    public static final List f64063Y = AbstractC17681o.m19382k(ParameterNames.f31999ID, "legacyId", "display", "author", "model", "tags", "lastInteractedAt", "gizmoType", "vanityMetrics", "tools", "instructions", "files", "productFeatures", "shareRecipient");

    /* JADX WARN: Code duplicated, block: B:76:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a0 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r18v4 java.lang.Object, still in use, count: 2, list:
          (r18v4 java.lang.Object) from 0x009c: PHI (r18 I:??) = (r18v1 java.lang.Object), (r18v4 java.lang.Object) binds: [B:36:0x009a, B:97:0x009c] A[DONT_GENERATE, DONT_INLINE]
          (r18v4 java.lang.Object) from 0x008d: CHECK_CAST (xh.F) (r18v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: a */
    public static p1042uh.C20241E m21017a(p1006s6.InterfaceC19455e r19, p917o6.C17867t r20) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1042uh.AbstractC20249M.m21017a(s6.e, o6.t):uh.E");
    }

    /* JADX INFO: renamed from: b */
    public static void m21018b(InterfaceC19456f writer, C17867t customScalarAdapters, C20241E value) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        writer.mo20545M0(ParameterNames.f31999ID);
        C17849b c17849b = AbstractC17850c.f56903a;
        c17849b.mo369f(writer, customScalarAdapters, value.f64036a);
        writer.mo20545M0("legacyId");
        c17849b.mo369f(writer, customScalarAdapters, value.f64037b);
        writer.mo20545M0(VjclRfeKsMflo.TLGLOwVvAW);
        AbstractC17850c.m19594b(C20245I.f64056Y, false).mo369f(writer, customScalarAdapters, value.f64038c);
        writer.mo20545M0(nkFZpTrMPpn.NCmIRUrXiXzUa);
        AbstractC17850c.m19594b(C20244H.f64054Y, false).mo369f(writer, customScalarAdapters, value.f64039d);
        writer.mo20545M0("model");
        C17839G c17839g = AbstractC17850c.f56907e;
        c17839g.mo369f(writer, customScalarAdapters, value.f64040e);
        writer.mo20545M0("tags");
        C21541a c21541a = C21541a.f68231r0;
        ArrayList arrayList = value.f64041f;
        writer.mo20556q();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c21541a.mo369f(writer, customScalarAdapters, it.next());
        }
        writer.mo20555p();
        writer.mo20545M0("lastInteractedAt");
        AbstractC17850c.m19593a(AbstractC21890a.f69408a).mo369f(writer, customScalarAdapters, value.f64042g);
        writer.mo20545M0("gizmoType");
        c17839g.mo369f(writer, customScalarAdapters, value.f64043h);
        writer.mo20545M0("vanityMetrics");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20259X.f64077Y, false)).mo369f(writer, customScalarAdapters, value.f64044i);
        writer.mo20545M0("tools");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20258W.f64075Y, false)).mo369f(writer, customScalarAdapters, value.f64045j);
        writer.mo20545M0("instructions");
        c17839g.mo369f(writer, customScalarAdapters, value.f64046k);
        writer.mo20545M0("files");
        C0095w0 c0095w0M19594b = AbstractC17850c.m19594b(C20248L.f64062Y, true);
        ArrayList arrayList2 = value.f64047l;
        writer.mo20556q();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c0095w0M19594b.mo369f(writer, customScalarAdapters, it2.next());
        }
        writer.mo20555p();
        writer.mo20545M0("productFeatures");
        AbstractC17850c.m19593a(AbstractC17850c.m19594b(C20257V.f64073Y, false)).mo369f(writer, customScalarAdapters, value.f64048m);
        writer.mo20545M0("shareRecipient");
        writer.mo20544L(value.f64049n.f67494Y);
    }
}
