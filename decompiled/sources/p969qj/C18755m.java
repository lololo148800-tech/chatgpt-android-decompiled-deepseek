package p969qj;

import android.util.Size;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p279L1.VOxZ.sVoFrD;
import p909nm.AbstractC17659D;
import p949pj.EnumC18448V;

/* JADX INFO: renamed from: qj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18755m implements InterfaceC18753k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59640a;

    /* JADX INFO: renamed from: b */
    public final Object f59641b;

    public C18755m(C18756n c18756n, C18752j c18752j) {
        this.f59640a = 0;
        this.f59641b = AbstractC17659D.m19244f(new C17309l(c18752j, EnumC18448V.f58868Z), new C17309l(c18756n, EnumC18448V.f58867Y));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0258  */
    /* JADX WARN: Code duplicated, block: B:115:0x029a  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:124:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x02c1 -> B:119:0x02c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p969qj.InterfaceC18753k
    /* JADX INFO: renamed from: a */
    public final java.lang.Object mo20046a(p468T2.C7224p r28, android.graphics.Rect r29, sm.AbstractC19687c r30) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p969qj.C18755m.mo20046a(T2.p, android.graphics.Rect, sm.c):java.lang.Object");
    }

    public C18755m(int i10) {
        this.f59640a = i10;
        switch (i10) {
            case 2:
                try {
                    AbstractC16544l.m18092e(Class.forName(sVoFrD.ZcTIjSmfVAUSui).newInstance(), "null cannot be cast to non-null type com.withpersona.sdk2.camera.analyzers.TextEntityExtractor");
                    throw new ClassCastException();
                } catch (ClassNotFoundException unused) {
                    this.f59641b = new HashMap();
                    return;
                }
            default:
                this.f59641b = new byte[32768];
                new Size(0, 0);
                return;
        }
    }
}
