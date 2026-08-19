package p271Kj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import p366Oj.C6262d;
import p396Q4.InterfaceC6571a;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: Kj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4706a implements InterfaceC6571a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15299a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f15300b;

    /* JADX INFO: renamed from: c */
    public final View f15301c;

    /* JADX INFO: renamed from: d */
    public final View f15302d;

    public /* synthetic */ C4706a(ViewGroup viewGroup, View view, View view2, int i10) {
        this.f15299a = i10;
        this.f15300b = viewGroup;
        this.f15301c = view;
        this.f15302d = view2;
    }

    /* JADX INFO: renamed from: a */
    public static C4706a m5402a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.pi2_ui_input_number, (ViewGroup) null, false);
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC9123E2.m9654b(viewInflate, R.id.edit_text);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.edit_text)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate;
        return new C4706a(textInputLayout, textInputEditText, textInputLayout, 2);
    }

    @Override // p396Q4.InterfaceC6571a
    public final View getRoot() {
        switch (this.f15299a) {
            case 0:
                return (C6262d) this.f15300b;
            case 1:
                return (Pi2NavigationBar) this.f15300b;
            default:
                return (TextInputLayout) this.f15300b;
        }
    }
}
