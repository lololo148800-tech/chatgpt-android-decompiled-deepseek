package p664bc;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.AbstractC11165g0;
import ao.C11163f0;
import io.sentry.config.AbstractC15340a;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import om.C18236c;
import p030B2.AbstractC0727H;
import p039Bc.C0886t;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21323q;
import p349O0.C6018n0;
import p349O0.C6021p;
import p466T0.C7183j;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p606Yn.AbstractC10105f;
import p606Yn.C10100a;
import p606Yn.C10106g;
import p606Yn.C10110k;
import p635a1.C10456n;
import p909nm.AbstractC17678l;
import p946pc.C18320E;

/* JADX INFO: renamed from: bc.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11336c {
    /* JADX INFO: renamed from: a */
    public static final void m12771a(C18320E c18320e, boolean z6, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6526U(-669923173);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(c18320e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (z6) {
                c6021p.m6525T(-1315612423);
                c8410b.mo985d(c18320e, c10456n, c6021p, Integer.valueOf((i11 & 896) | (i11 & 14) | 48));
                c6021p.m6553p(false);
            } else {
                c6021p.m6525T(-1315612531);
                c8410b.mo985d(c18320e, AbstractC8479G.m9122c(c10456n, AbstractC8479G.m9124e(c6021p)), c6021p, Integer.valueOf(i11 & 910));
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(c18320e, z6, c8410b, i10, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C11163f0 m12772b(String str, AbstractC10105f abstractC10105f) {
        if (AbstractC21322p.m21681O(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((C7183j) AbstractC11165g0.f33806a.values()).iterator();
        while (((AbstractC0727H) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((C18236c) it).next();
            if (str.equals(kSerializer.getDescriptor().mo10679a())) {
                StringBuilder sbM11058p = AbstractC10763a.m11058p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM11058p.append(AbstractC16526C.f51263a.mo5693b(kSerializer.getClass()).mo4448c());
                sbM11058p.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(AbstractC21323q.m21717d(sbM11058p.toString()));
            }
        }
        return new C11163f0(str, abstractC10105f);
    }

    /* JADX INFO: renamed from: c */
    public static final C10106g m12773c(String str, SerialDescriptor[] serialDescriptorArr, InterfaceC1436k builderAction) {
        AbstractC16544l.m18094g(builderAction, "builderAction");
        if (AbstractC21322p.m21681O(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C10100a c10100a = new C10100a(str);
        builderAction.invoke(c10100a);
        return new C10106g(str, C10110k.f29935b, c10100a.f29900c.size(), AbstractC17678l.m19291N(serialDescriptorArr), c10100a);
    }

    /* JADX INFO: renamed from: d */
    public static final C10106g m12774d(String serialName, AbstractC15340a abstractC15340a, SerialDescriptor[] serialDescriptorArr, InterfaceC1436k builder) {
        AbstractC16544l.m18094g(serialName, "serialName");
        AbstractC16544l.m18094g(builder, "builder");
        if (AbstractC21322p.m21681O(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC15340a.equals(C10110k.f29935b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C10100a c10100a = new C10100a(serialName);
        builder.invoke(c10100a);
        return new C10106g(serialName, abstractC15340a, c10100a.f29900c.size(), AbstractC17678l.m19291N(serialDescriptorArr), c10100a);
    }
}
