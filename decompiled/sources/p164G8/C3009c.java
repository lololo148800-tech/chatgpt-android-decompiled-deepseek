package p164G8;

import hm.InterfaceC14537b;
import hm.InterfaceC14538c;
import hm.InterfaceC14539d;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1021t8.C19813d;
import p187H8.AbstractC3263a;
import p237J8.C4289f;
import p237J8.C4291h;
import p262K8.C4550a;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: G8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3009c implements InterfaceC14539d {

    /* JADX INFO: renamed from: a */
    public final C4550a f9053a;

    /* JADX INFO: renamed from: b */
    public final String f9054b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f9055c;

    /* JADX INFO: renamed from: d */
    public InterfaceC14538c f9056d;

    /* JADX INFO: renamed from: e */
    public String f9057e;

    /* JADX INFO: renamed from: f */
    public String f9058f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C19813d f9059g;

    public C3009c(C19813d c19813d, String str, C4550a c4550a) {
        this.f9059g = c19813d;
        this.f9055c = new LinkedHashMap(c19813d.f9069r0);
        this.f9054b = str;
        this.f9053a = c4550a;
    }

    @Override // hm.InterfaceC14539d
    /* JADX INFO: renamed from: a */
    public final InterfaceC14539d mo3846a(InterfaceC14537b interfaceC14537b) {
        this.f9056d = interfaceC14537b == null ? null : interfaceC14537b.mo3833c();
        return this;
    }

    @Override // hm.InterfaceC14539d
    /* JADX INFO: renamed from: b */
    public final InterfaceC14539d mo3847b(InterfaceC14538c interfaceC14538c) {
        this.f9056d = interfaceC14538c;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m3848c() {
        BigInteger bigInteger;
        do {
            synchronized (this.f9059g.f9077z0) {
                bigInteger = new BigInteger(this.f9059g.f9077z0.mo5608a().mo5605a(), 16);
            }
        } while (bigInteger.signum() == 0);
        return bigInteger;
    }

    /* JADX INFO: renamed from: d */
    public final void m3849d(String str, String str2) {
        LinkedHashMap linkedHashMap = this.f9055c;
        if (str2 == null || str2.isEmpty()) {
            linkedHashMap.remove(str);
        } else {
            linkedHashMap.put(str, str2);
        }
    }

    @Override // hm.InterfaceC14539d
    public final InterfaceC14537b start() {
        C3014h c3014h;
        BigInteger bigInteger;
        int i10;
        BigInteger bigInteger2;
        Map map;
        String str;
        String str2;
        Map map2;
        int i11;
        C3013g c3013g;
        InterfaceC14537b interfaceC14537bM5318b;
        do {
            synchronized (this.f9059g.f9063A0) {
                c3014h = new C3014h(63, this.f9059g.f9063A0);
            }
        } while (c3014h.signum() == 0);
        InterfaceC14538c interfaceC14538cMo3833c = this.f9056d;
        if (interfaceC14538cMo3833c == null && (interfaceC14537bM5318b = this.f9053a.m5318b()) != null) {
            interfaceC14538cMo3833c = interfaceC14537bM5318b.mo3833c();
        }
        if (interfaceC14538cMo3833c instanceof C3008b) {
            C3008b c3008b = (C3008b) interfaceC14538cMo3833c;
            BigInteger bigInteger3 = c3008b.f9041d;
            bigInteger = c3008b.f9042e;
            ConcurrentHashMap concurrentHashMap = c3008b.f9040c;
            C3013g c3013g2 = c3008b.f9039b;
            if (this.f9057e == null) {
                this.f9057e = c3008b.f9045h;
            }
            i11 = Integer.MIN_VALUE;
            map2 = concurrentHashMap;
            c3013g = c3013g2;
            str2 = null;
            bigInteger2 = bigInteger3;
        } else {
            if (interfaceC14538cMo3833c instanceof C4289f) {
                C4289f c4289f = (C4289f) interfaceC14538cMo3833c;
                bigInteger2 = c4289f.f13959c;
                bigInteger = c4289f.f13960d;
                i10 = c4289f.f13961e;
                map = c4289f.f13962f;
            } else {
                BigInteger bigIntegerM3848c = m3848c();
                bigInteger = BigInteger.ZERO;
                i10 = Integer.MIN_VALUE;
                bigInteger2 = bigIntegerM3848c;
                map = null;
            }
            if (interfaceC14538cMo3833c instanceof C4291h) {
                C4291h c4291h = (C4291h) interfaceC14538cMo3833c;
                this.f9055c.putAll(c4291h.f13965b);
                str = c4291h.f13964a;
            } else {
                str = this.f9058f;
            }
            this.f9055c.putAll(this.f9059g.f9068q0);
            str2 = str;
            map2 = map;
            i11 = i10;
            c3013g = new C3013g(this.f9059g, bigInteger2);
        }
        if (this.f9057e == null) {
            this.f9057e = this.f9059g.f9064Y;
        }
        String str3 = this.f9054b;
        String str4 = str3 != null ? str3 : null;
        String str5 = this.f9057e;
        LinkedHashMap linkedHashMap = this.f9055c;
        C19813d c19813d = this.f9059g;
        C3008b c3008b2 = new C3008b(bigInteger2, c3014h, bigInteger, str5, str4, i11, str2, map2, linkedHashMap, c3013g, c19813d, c19813d.f9070s0);
        for (Map.Entry entry : this.f9055c.entrySet()) {
            if (entry.getValue() == null) {
                c3008b2.m3845h((String) entry.getKey(), null);
            } else {
                List<AbstractC3263a> list = (List) this.f9059g.f9073v0.get((String) entry.getKey());
                boolean zMo4147a = true;
                if (list != null) {
                    for (AbstractC3263a abstractC3263a : list) {
                        zMo4147a &= abstractC3263a.mo4147a(c3008b2, entry.getValue());
                    }
                }
                if (!zMo4147a) {
                    c3008b2.m3845h((String) entry.getKey(), null);
                }
            }
        }
        return new C3007a(c3008b2);
    }
}
