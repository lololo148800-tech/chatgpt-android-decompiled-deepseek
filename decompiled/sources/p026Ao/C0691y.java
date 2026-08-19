package p026Ao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p909nm.AbstractC17685s;

/* JADX INFO: renamed from: Ao.y */
/* JADX INFO: loaded from: classes2.dex */
public class C0691y extends AbstractC0682p {
    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: b */
    public final void mo1395b(C0654C path) throws IOException {
        AbstractC16544l.m18094g(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileM1322f = path.m1322f();
        if (fileM1322f.delete() || !fileM1322f.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: e */
    public final List mo1396e(C0654C dir) throws IOException {
        AbstractC16544l.m18094g(dir, "dir");
        File fileM1322f = dir.m1322f();
        String[] list = fileM1322f.list();
        if (list == null) {
            if (fileM1322f.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC16544l.m18091d(str);
            arrayList.add(dir.m1321e(str));
        }
        AbstractC17685s.m19391t(arrayList);
        return arrayList;
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: g */
    public C0681o mo1397g(C0654C path) {
        AbstractC16544l.m18094g(path, "path");
        File fileM1322f = path.m1322f();
        boolean zIsFile = fileM1322f.isFile();
        boolean zIsDirectory = fileM1322f.isDirectory();
        long jLastModified = fileM1322f.lastModified();
        long length = fileM1322f.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !fileM1322f.exists()) {
            return null;
        }
        return new C0681o(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: h */
    public final C0690x mo1398h(C0654C c0654c) {
        return new C0690x(new RandomAccessFile(c0654c.m1322f(), "r"));
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: i */
    public final InterfaceC0661J mo1399i(C0654C file, boolean z6) throws IOException {
        AbstractC16544l.m18094g(file, "file");
        if (z6 && m1463d(file)) {
            throw new IOException(file + " already exists.");
        }
        File fileM1322f = file.m1322f();
        Logger logger = AbstractC0652A.f1907a;
        return new C0670d(AbstractC8752z3.m9508c(fileM1322f, new FileOutputStream(fileM1322f, false), false), 1, new C0665N());
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: j */
    public final InterfaceC0663L mo1400j(C0654C file) {
        AbstractC16544l.m18094g(file, "file");
        File fileM1322f = file.m1322f();
        Logger logger = AbstractC0652A.f1907a;
        return new C0671e(AbstractC8746y3.m9492c(fileM1322f, new FileInputStream(fileM1322f)), C0665N.f1937d);
    }

    /* JADX INFO: renamed from: k */
    public void mo1472k(C0654C source, C0654C target) throws IOException {
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(target, "target");
        if (source.m1322f().renameTo(target.m1322f())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
