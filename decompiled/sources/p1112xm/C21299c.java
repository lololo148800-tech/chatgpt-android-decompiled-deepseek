package p1112xm;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p1091wn.C21021b;
import p1091wn.C21022c;

/* JADX INFO: renamed from: xm.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C21299c extends AbstractC21298b {

    /* JADX INFO: renamed from: b */
    public boolean f67702b;

    /* JADX INFO: renamed from: c */
    public File[] f67703c;

    /* JADX INFO: renamed from: d */
    public int f67704d;

    /* JADX INFO: renamed from: e */
    public boolean f67705e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C21021b f67706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21299c(C21021b c21021b, File rootDir) {
        super(rootDir);
        AbstractC16544l.m18094g(rootDir, "rootDir");
        this.f67706f = c21021b;
    }

    @Override // p1112xm.AbstractC21302f
    /* JADX INFO: renamed from: a */
    public final File mo21639a() {
        boolean z6 = this.f67705e;
        File file = this.f67712a;
        C21021b c21021b = this.f67706f;
        if (!z6 && this.f67703c == null) {
            ((C21022c) c21021b.f66889q0).getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f67703c = fileArrListFiles;
            if (fileArrListFiles == null) {
                ((C21022c) c21021b.f66889q0).getClass();
                this.f67705e = true;
            }
        }
        File[] fileArr = this.f67703c;
        if (fileArr != null && this.f67704d < fileArr.length) {
            AbstractC16544l.m18091d(fileArr);
            int i10 = this.f67704d;
            this.f67704d = i10 + 1;
            return fileArr[i10];
        }
        if (this.f67702b) {
            ((C21022c) c21021b.f66889q0).getClass();
            return null;
        }
        this.f67702b = true;
        return file;
    }
}
