package p606Yn;

import android.gov.nist.core.Separators;
import ao.AbstractC11153a0;
import ao.InterfaceC11174l;
import io.sentry.config.AbstractC15340a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mm.C17309l;
import mm.C17314q;
import p008A6.C0386f;
import p033B5.C0819c;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17692z;

/* JADX INFO: renamed from: Yn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C10106g implements SerialDescriptor, InterfaceC11174l {

    /* JADX INFO: renamed from: a */
    public final String f29919a;

    /* JADX INFO: renamed from: b */
    public final AbstractC15340a f29920b;

    /* JADX INFO: renamed from: c */
    public final int f29921c;

    /* JADX INFO: renamed from: d */
    public final List f29922d;

    /* JADX INFO: renamed from: e */
    public final HashSet f29923e;

    /* JADX INFO: renamed from: f */
    public final String[] f29924f;

    /* JADX INFO: renamed from: g */
    public final SerialDescriptor[] f29925g;

    /* JADX INFO: renamed from: h */
    public final List[] f29926h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f29927i;

    /* JADX INFO: renamed from: j */
    public final Map f29928j;

    /* JADX INFO: renamed from: k */
    public final SerialDescriptor[] f29929k;

    /* JADX INFO: renamed from: l */
    public final C17314q f29930l;

    public C10106g(String serialName, AbstractC15340a abstractC15340a, int i10, List list, C10100a c10100a) {
        AbstractC16544l.m18094g(serialName, "serialName");
        this.f29919a = serialName;
        this.f29920b = abstractC15340a;
        this.f29921c = i10;
        this.f29922d = c10100a.f29899b;
        ArrayList arrayList = c10100a.f29900c;
        AbstractC16544l.m18094g(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList, 12)));
        AbstractC17680n.m19376z0(arrayList, hashSet);
        this.f29923e = hashSet;
        int i11 = 0;
        this.f29924f = (String[]) arrayList.toArray(new String[0]);
        this.f29925g = AbstractC11153a0.m12380c(c10100a.f29902e);
        this.f29926h = (List[]) c10100a.f29903f.toArray(new List[0]);
        ArrayList arrayList2 = c10100a.f29904g;
        AbstractC16544l.m18094g(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        this.f29927i = zArr;
        String[] strArr = this.f29924f;
        AbstractC16544l.m18094g(strArr, "<this>");
        C10107h c10107h = new C10107h(new C0819c(strArr, 18), 2);
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(c10107h, 10));
        Iterator it2 = c10107h.iterator();
        while (true) {
            C17656A c17656a = (C17656A) it2;
            if (!c17656a.f56445Z.hasNext()) {
                this.f29928j = AbstractC17659D.m19253o(arrayList3);
                this.f29929k = AbstractC11153a0.m12380c(list);
                this.f29930l = AbstractC9227W.m9800c(new C0819c(this, 13));
                return;
            }
            C17692z c17692z = (C17692z) c17656a.next();
            arrayList3.add(new C17309l(c17692z.f56484b, Integer.valueOf(c17692z.f56483a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return this.f29919a;
    }

    @Override // ao.InterfaceC11174l
    /* JADX INFO: renamed from: b */
    public final Set mo10687b() {
        return this.f29923e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo10680c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo10681d(String name) {
        AbstractC16544l.m18094g(name, "name");
        Integer num = (Integer) this.f29928j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        return this.f29921c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10106g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC16544l.m18089b(this.f29919a, serialDescriptor.mo10679a()) && Arrays.equals(this.f29929k, ((C10106g) obj).f29929k)) {
                int iMo10682e = serialDescriptor.mo10682e();
                int i10 = this.f29921c;
                if (i10 == iMo10682e) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        SerialDescriptor[] serialDescriptorArr = this.f29925g;
                        if (AbstractC16544l.m18089b(serialDescriptorArr[i11].mo10679a(), serialDescriptor.mo10685h(i11).mo10679a()) && AbstractC16544l.m18089b(serialDescriptorArr[i11].getKind(), serialDescriptor.mo10685h(i11).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        return this.f29924f[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        return this.f29926h[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f29922d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        return this.f29920b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        return this.f29925g[i10];
    }

    public final int hashCode() {
        return ((Number) this.f29930l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        return this.f29927i[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC17680n.m19349Y(AbstractC8301I.m8929t(0, this.f29921c), ", ", AbstractC9306j0.m9892k(new StringBuilder(), this.f29919a, '('), Separators.RPAREN, 0, null, new C0386f(this, 19), 24);
    }
}
