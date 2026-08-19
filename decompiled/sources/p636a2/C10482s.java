package p636a2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.InterfaceC21059M;
import p138F8.vJO.vRJidSveZHcTw;
import p492U1.C7540e;
import p492U1.EnumC7546k;
import p571X9.AbstractC9388w4;
import p716e2.C13265b;

/* JADX INFO: renamed from: a2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C10482s {

    /* JADX INFO: renamed from: a */
    public final HashMap f31053a;

    /* JADX INFO: renamed from: b */
    public final HashMap f31054b;

    /* JADX INFO: renamed from: c */
    public final HashMap f31055c;

    /* JADX INFO: renamed from: d */
    public final C13265b f31056d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC21059M f31057e;

    /* JADX INFO: renamed from: f */
    public long f31058f;

    /* JADX INFO: renamed from: g */
    public EnumC7546k f31059g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f31060h;

    /* JADX INFO: renamed from: i */
    public boolean f31061i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f31062j;

    /* JADX INFO: renamed from: a */
    public final C13265b m10948a(Object obj) {
        HashMap map = this.f31053a;
        C13265b c13265b = (C13265b) map.get(obj);
        if (c13265b == null) {
            c13265b = new C13265b(this);
            map.put(obj, c13265b);
            c13265b.f41898a = obj;
        }
        if (c13265b instanceof C13265b) {
            return c13265b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m10949b(C7540e c7540e) {
        return this.f31057e.mo7866k0(c7540e.f23894Y);
    }

    public C10482s(InterfaceC21059M interfaceC21059M) {
        AbstractC16544l.m18094g(interfaceC21059M, vRJidSveZHcTw.wrM);
        HashMap map = new HashMap();
        this.f31053a = map;
        this.f31054b = new HashMap();
        this.f31055c = new HashMap();
        C13265b c13265b = new C13265b(this);
        this.f31056d = c13265b;
        map.put(0, c13265b);
        this.f31057e = interfaceC21059M;
        this.f31058f = AbstractC9388w4.m9959b(0, 0, 15);
        this.f31060h = new ArrayList();
        this.f31061i = true;
        this.f31062j = new LinkedHashSet();
    }
}
