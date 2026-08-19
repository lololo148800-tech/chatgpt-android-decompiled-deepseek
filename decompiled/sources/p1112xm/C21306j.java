package p1112xm;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0740V;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: xm.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C21306j implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public String f67717Y;

    /* JADX INFO: renamed from: Z */
    public boolean f67718Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0740V f67719o0;

    public C21306j(C0740V c0740v) {
        this.f67719o0 = c0740v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f67717Y == null && !this.f67718Z) {
            String line = ((BufferedReader) this.f67719o0.f2104b).readLine();
            this.f67717Y = line;
            if (line == null) {
                this.f67718Z = true;
            }
        }
        return this.f67717Y != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f67717Y;
        this.f67717Y = null;
        AbstractC16544l.m18091d(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
