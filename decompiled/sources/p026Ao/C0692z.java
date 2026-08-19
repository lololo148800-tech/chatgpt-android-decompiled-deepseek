package p026Ao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.AbstractC16544l;
import p1061vb.C20513d;

/* JADX INFO: renamed from: Ao.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0692z extends C0691y {
    /* JADX INFO: renamed from: l */
    public static Long m1473l(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p026Ao.C0691y, p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: g */
    public final C0681o mo1397g(C0654C path) {
        C0654C c0654cM21169n;
        AbstractC16544l.m18094g(path, "path");
        Path pathM1323g = path.m1323g();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathM1323g, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathM1323g) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = C0654C.f1910Z;
                c0654cM21169n = C20513d.m21169n(symbolicLink.toString(), false);
            } else {
                c0654cM21169n = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM1473l = fileTimeCreationTime != null ? m1473l(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM1473l2 = fileTimeLastModifiedTime != null ? m1473l(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C0681o(zIsRegularFile, zIsDirectory, c0654cM21169n, lValueOf, lM1473l, lM1473l2, fileTimeLastAccessTime != null ? m1473l(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // p026Ao.C0691y
    /* JADX INFO: renamed from: k */
    public final void mo1472k(C0654C source, C0654C target) throws IOException {
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(target, "target");
        try {
            Files.move(source.m1323g(), target.m1323g(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // p026Ao.C0691y
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
