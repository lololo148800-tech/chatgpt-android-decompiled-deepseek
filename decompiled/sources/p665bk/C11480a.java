package p665bk;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import p396Q4.InterfaceC6571a;

/* JADX INFO: renamed from: bk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11480a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f34719a;

    /* JADX INFO: renamed from: b */
    public final Button f34720b;

    /* JADX INFO: renamed from: c */
    public final View f34721c;

    /* JADX INFO: renamed from: d */
    public final TextView f34722d;

    /* JADX INFO: renamed from: e */
    public final TextView f34723e;

    /* JADX INFO: renamed from: f */
    public final ProgressBar f34724f;

    /* JADX INFO: renamed from: g */
    public final Pi2NavigationBar f34725g;

    /* JADX INFO: renamed from: h */
    public final PreviewView f34726h;

    /* JADX INFO: renamed from: i */
    public final SelfieOverlayView f34727i;

    /* JADX INFO: renamed from: j */
    public final TextView f34728j;

    public C11480a(ConstraintLayout constraintLayout, Button button, Camera2PreviewView camera2PreviewView, View view, TextView textView, TextView textView2, ProgressBar progressBar, Pi2NavigationBar pi2NavigationBar, PreviewView previewView, SelfieOverlayView selfieOverlayView, TextView textView3) {
        this.f34719a = constraintLayout;
        this.f34720b = button;
        this.f34721c = view;
        this.f34722d = textView;
        this.f34723e = textView2;
        this.f34724f = progressBar;
        this.f34725g = pi2NavigationBar;
        this.f34726h = previewView;
        this.f34727i = selfieOverlayView;
        this.f34728j = textView3;
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        return this.f34719a;
    }
}
