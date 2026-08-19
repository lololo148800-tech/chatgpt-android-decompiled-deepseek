package p943p7;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p315Me.Myis.CxcULo;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: p7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18304b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58427Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ File f58428Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18304b(File file, int i10) {
        super(0);
        this.f58427Y = i10;
        this.f58428Z = file;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        File file = this.f58428Z;
        switch (this.f58427Y) {
            case 0:
                return String.format(Locale.ENGLISH, "Unable to parse the file name as a timestamp: %s", Arrays.copyOf(new Object[]{file.getName()}, 1));
            case 1:
                return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 2:
                return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 3:
                return AbstractC9306j0.m9889h("Security exception was thrown for file ", file.getPath());
            case 4:
                return AbstractC9306j0.m9889h("Unexpected exception was thrown for file ", file.getPath());
            case 5:
                return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 6:
                return String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 7:
                return String.format(Locale.US, "Unable to move files; source directory does not exist: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 8:
                return String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 9:
                return String.format(Locale.US, "Unable to move files; could not create directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 10:
                return String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 11:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 12:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 13:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 14:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 15:
                return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 16:
                return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 17:
                return String.format(Locale.US, CxcULo.CYSWQbcCR, Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 18:
                return String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 19:
                return String.format(Locale.US, "File %s is probably corrupted, not all content was read.", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            case 20:
                return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
            default:
                return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
        }
    }
}
