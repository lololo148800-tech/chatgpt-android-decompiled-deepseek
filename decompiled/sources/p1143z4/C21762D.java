package p1143z4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p011A9.p012Ra.ahZQMZ;
import p1113xn.AbstractC21329w;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: renamed from: z4.D */
/* JADX INFO: loaded from: classes.dex */
public final class C21762D extends C21766H {

    /* JADX INFO: renamed from: m */
    public final Class f69035m;

    public C21762D(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f69035m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + ahZQMZ.bNFHvEjCfmJF).toString());
    }

    @Override // p1143z4.C21766H, p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: b */
    public final String mo5894b() {
        return this.f69035m.getName();
    }

    @Override // p1143z4.C21766H
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum mo5895c(String str) {
        Object obj;
        Class cls = this.f69035m;
        Object[] enumConstants = cls.getEnumConstants();
        AbstractC16544l.m18093f(enumConstants, MMVKXkcLpuHFDi.FcAd);
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i10];
            if (AbstractC21329w.m21726m(((Enum) obj).name(), str)) {
                break;
            }
            i10++;
        }
        Enum r6 = (Enum) obj;
        if (r6 != null) {
            return r6;
        }
        StringBuilder sbM11058p = AbstractC10763a.m11058p("Enum value ", str, " not found for type ");
        sbM11058p.append(cls.getName());
        sbM11058p.append('.');
        throw new IllegalArgumentException(sbM11058p.toString());
    }
}
