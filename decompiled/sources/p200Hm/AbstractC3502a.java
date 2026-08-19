package p200Hm;

import java.util.Iterator;
import p076Cm.InterfaceC1723a;
import p523V9.AbstractC7965P4;

/* JADX INFO: renamed from: Hm.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3502a implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final char f10582Y;

    /* JADX INFO: renamed from: Z */
    public final char f10583Z;

    /* JADX INFO: renamed from: o0 */
    public final int f10584o0 = 1;

    public AbstractC3502a(char c9, char c10) {
        this.f10582Y = c9;
        this.f10583Z = (char) AbstractC7965P4.m8252c(c9, c10, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3503b(this.f10582Y, this.f10583Z, this.f10584o0);
    }
}
