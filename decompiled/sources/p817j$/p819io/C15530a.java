package p817j$.p819io;

import java.io.BufferedReader;
import java.io.IOException;
import java.p831io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.io.a */
/* JADX INFO: loaded from: classes4.dex */
final class C15530a implements Iterator {

    /* JADX INFO: renamed from: a */
    private final BufferedReader f48506a;

    /* JADX INFO: renamed from: b */
    String f48507b = null;

    C15530a(BufferedReader bufferedReader) {
        this.f48506a = bufferedReader;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f48507b != null) {
            return true;
        }
        try {
            String line = this.f48506a.readLine();
            this.f48507b = line;
            return line != null;
        } catch (IOException e10) {
            throw new UncheckedIOException(e10);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f48507b != null || hasNext()) {
            String str = this.f48507b;
            this.f48507b = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
