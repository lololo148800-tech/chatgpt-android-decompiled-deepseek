package p917o6;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p008A6.C0384d;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: o6.t */
/* JADX INFO: loaded from: classes.dex */
public final class C17867t implements InterfaceC17833A {

    /* JADX INFO: renamed from: e */
    public static final C17849b f56959e = new C17849b(5);

    /* JADX INFO: renamed from: f */
    public static final C17867t f56960f = new C17867t(new LinkedHashMap(), null, null, null);

    /* JADX INFO: renamed from: a */
    public final Set f56961a;

    /* JADX INFO: renamed from: b */
    public final Set f56962b;

    /* JADX INFO: renamed from: c */
    public final List f56963c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f56964d;

    static {
        new LinkedHashMap();
    }

    public C17867t(LinkedHashMap linkedHashMap, Set set, Set set2, List list) {
        this.f56961a = set;
        this.f56962b = set2;
        this.f56963c = list;
        this.f56964d = linkedHashMap;
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC17835C mo4138a(InterfaceC17834B interfaceC17834B) {
        return AbstractC17792x.m19519b(this, interfaceC17834B);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC17835C mo4139b(InterfaceC17835C interfaceC17835C) {
        return AbstractC17792x.m19520c(this, interfaceC17835C);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: c */
    public final Object mo4140c(InterfaceC17835C interfaceC17835C, C0384d c0384d) {
        return c0384d.invoke(interfaceC17835C, this);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC17833A mo4141d(InterfaceC17834B interfaceC17834B) {
        return AbstractC17792x.m19518a(this, interfaceC17834B);
    }

    @Override // p917o6.InterfaceC17833A
    public final InterfaceC17834B getKey() {
        return f56959e;
    }
}
