package p082D2;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: D2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1861h implements InterfaceC1862i {

    /* JADX INFO: renamed from: Y */
    public final InputContentInfo f5346Y;

    public C1861h(Object obj) {
        this.f5346Y = (InputContentInfo) obj;
    }

    @Override // p082D2.InterfaceC1862i
    /* JADX INFO: renamed from: c */
    public final Uri mo2741c() {
        return this.f5346Y.getContentUri();
    }

    @Override // p082D2.InterfaceC1862i
    /* JADX INFO: renamed from: f */
    public final void mo2742f() {
        this.f5346Y.requestPermission();
    }

    @Override // p082D2.InterfaceC1862i
    /* JADX INFO: renamed from: g */
    public final Uri mo2743g() {
        return this.f5346Y.getLinkUri();
    }

    @Override // p082D2.InterfaceC1862i
    public final ClipDescription getDescription() {
        return this.f5346Y.getDescription();
    }

    @Override // p082D2.InterfaceC1862i
    /* JADX INFO: renamed from: j */
    public final Object mo2744j() {
        return this.f5346Y;
    }

    public C1861h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f5346Y = new InputContentInfo(uri, clipDescription, uri2);
    }
}
