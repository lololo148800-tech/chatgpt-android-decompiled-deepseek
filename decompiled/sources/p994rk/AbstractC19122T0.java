package p994rk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;

/* JADX INFO: renamed from: rk.T0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC19122T0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60827a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f60828b;

    static {
        int[] iArr = new int[UiComponentConfig.InputText.InputType.values().length];
        try {
            iArr[UiComponentConfig.InputText.InputType.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UiComponentConfig.InputText.InputType.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UiComponentConfig.InputText.InputType.NUMBER_PAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f60827a = iArr;
        int[] iArr2 = new int[UiComponentConfig.InputText.AutofillHint.values().length];
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.NAME_FIRST.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.NAME_MIDDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.NAME_LAST.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.EMAIL.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.ADDRESS_LINE_1.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.ADDRESS_LINE_2.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.CITY.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.COUNTRY.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[UiComponentConfig.InputText.AutofillHint.POSTAL_CODE.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        f60828b = iArr2;
    }
}
