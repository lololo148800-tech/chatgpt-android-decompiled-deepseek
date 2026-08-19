package p1112xm;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p1091wn.C21021b;
import p1091wn.C21022c;

/* JADX INFO: renamed from: xm.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C21301e extends AbstractC21298b {

    /* JADX INFO: renamed from: b */
    public boolean f67708b;

    /* JADX INFO: renamed from: c */
    public File[] f67709c;

    /* JADX INFO: renamed from: d */
    public int f67710d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C21021b f67711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21301e(C21021b c21021b, File rootDir) {
        super(rootDir);
        AbstractC16544l.m18094g(rootDir, "rootDir");
        this.f67711e = c21021b;
    }

    @Override // p1112xm.AbstractC21302f
    /* JADX INFO: renamed from: a */
    public final File mo21639a() {
        boolean z6 = this.f67708b;
        File file = this.f67712a;
        C21021b c21021b = this.f67711e;
        if (!z6) {
            ((C21022c) c21021b.f66889q0).getClass();
            this.f67708b = true;
            return file;
        }
        File[] fileArr = this.f67709c;
        if (fileArr != null && this.f67710d >= fileArr.length) {
            ((C21022c) c21021b.f66889q0).getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f67709c = fileArrListFiles;
            if (fileArrListFiles == null) {
                ((C21022c) c21021b.f66889q0).getClass();
            }
            File[] fileArr2 = this.f67709c;
            if (fileArr2 == null || fileArr2.length == 0) {
                ((C21022c) c21021b.f66889q0).getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f67709c;
        AbstractC16544l.m18091d(fileArr3);
        int i10 = this.f67710d;
        this.f67710d = i10 + 1;
        return fileArr3[i10];
    }
}
