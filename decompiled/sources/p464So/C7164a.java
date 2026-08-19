package p464So;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import p489To.C7529b;
import p658b5.C11242m;
import p712dp.C13187c;
import p712dp.InterfaceC13188d;
import p874lj.C17057a;
import p879lp.EnumC17120c;
import p885m4.C17151a;
import p885m4.C17152b;

/* JADX INFO: renamed from: So.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7164a implements InterfaceC13188d {
    @Override // p712dp.InterfaceC13188d
    /* JADX INFO: renamed from: a */
    public final void mo7540a(C13187c c13187c) {
        C7529b c7529b = new C7529b();
        EnumSet.allOf(EnumC17120c.class);
        EnumC17120c enumC17120c = EnumC17120c.f54726Y;
        EnumC17120c enumC17120c2 = EnumC17120c.f54727Z;
        EnumSet enumSetOf = EnumSet.of(enumC17120c, enumC17120c2);
        if (enumSetOf == null) {
            throw new NullPointerException("linkTypes must not be null");
        }
        HashSet hashSet = new HashSet(enumSetOf);
        c7529b.f23871a = new C11242m(hashSet.contains(enumC17120c) ? new C17151a() : null, hashSet.contains(EnumC17120c.f54728o0) ? new C17152b() : null, hashSet.contains(enumC17120c2) ? new C17057a(1) : null);
        ((ArrayList) c13187c.f41849g).add(c7529b);
    }
}
