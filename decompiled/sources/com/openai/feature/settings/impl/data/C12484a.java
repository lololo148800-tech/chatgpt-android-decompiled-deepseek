package com.openai.feature.settings.impl.data;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p292Lg.C5037i;
import p292Lg.C5038j;
import p292Lg.C5039k;
import p292Lg.C5040l;
import p292Lg.C5041m;
import p292Lg.InterfaceC5042n;
import p318Mh.AbstractC5364G0;
import p553Wh.C8870f;

/* JADX INFO: renamed from: com.openai.feature.settings.impl.data.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12484a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8870f f39561Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ DataControlsViewModel f39562Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f39563o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12484a(C8870f c8870f, DataControlsViewModel dataControlsViewModel, Context context) {
        super(1);
        this.f39561Y = c8870f;
        this.f39562Z = dataControlsViewModel;
        this.f39563o0 = context;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC5042n effect = (InterfaceC5042n) obj;
        AbstractC16544l.m18094g(effect, "effect");
        boolean z6 = effect instanceof C5037i;
        C8870f c8870f = this.f39561Y;
        if (z6) {
            c8870f.f27149b.m12195o();
            AbstractC5364G0.m5889d(c8870f.f27149b, ((C5037i) effect).f16485a, true);
        } else if (effect instanceof C5040l) {
            AbstractC21955Q1 abstractC21955Q1 = ((C5040l) effect).f16488a;
            if (abstractC21955Q1 instanceof C21952P1) {
                C8870f.m9547b(c8870f, R.string.settings_data_export_success);
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                C8870f.m9547b(c8870f, R.string.settings_data_export_failure);
            }
        } else if (effect instanceof C5039k) {
            AbstractC21955Q1 abstractC21955Q2 = ((C5039k) effect).f16487a;
            if (abstractC21955Q2 instanceof C21952P1) {
                C8870f.m9547b(c8870f, R.string.settings_data_clear_success);
            } else if (abstractC21955Q2 instanceof AbstractC21933K1) {
                C8870f.m9547b(c8870f, R.string.settings_data_clear_failure);
            }
        } else if (effect instanceof C5038j) {
            AbstractC21955Q1 abstractC21955Q3 = ((C5038j) effect).f16486a;
            if (abstractC21955Q3 instanceof C21952P1) {
                C8870f.m9547b(c8870f, R.string.settings_data_archive_success);
            } else if (abstractC21955Q3 instanceof AbstractC21933K1) {
                C8870f.m9547b(c8870f, R.string.settings_data_archive_failure);
            }
        } else if (effect instanceof C5041m) {
            AbstractC21955Q1 abstractC21955Q4 = ((C5041m) effect).f16489a;
            if (abstractC21955Q4 instanceof C21952P1) {
                C8870f.m9547b(c8870f, R.string.settings_account_delete_success);
                DataControlsViewModelImpl dataControlsViewModelImpl = (DataControlsViewModelImpl) this.f39562Z;
                dataControlsViewModelImpl.getClass();
                Context activity = this.f39563o0;
                AbstractC16544l.m18094g(activity, "activity");
                AbstractC0575H.m1156D(ViewModelKt.m12143a(dataControlsViewModelImpl), null, null, new DataControlsViewModelImpl$logout$1(dataControlsViewModelImpl, activity, null), 3);
            } else if (abstractC21955Q4 instanceof AbstractC21933K1) {
                C8870f.m9547b(c8870f, R.string.settings_account_delete_failure);
            }
        }
        return C17296C.f55119a;
    }
}
