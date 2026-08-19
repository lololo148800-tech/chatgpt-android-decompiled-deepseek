package com.revenuecat.purchases.common;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15379d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.C21307a;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p582Xk.HXHG.TfazcFv;
import p817j$.p819io.BufferedReaderRetargetClass;
import p817j$.util.function.Consumer$CC;
import p817j$.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\u001e\u0010\rJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$¨\u0006%"}, m18067d2 = {"Lcom/revenuecat/purchases/common/FileHelper;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "filePath", "Lkotlin/Function1;", "Ljava/io/BufferedReader;", "Lmm/C;", "contentBlock", "openBufferedReader", "(Ljava/lang/String;LBm/k;)V", "Ljava/io/File;", "getFileInFilesDir", "(Ljava/lang/String;)Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "", "fileSizeInKB", "(Ljava/lang/String;)D", "contentToAppend", "appendToFile", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deleteFile", "(Ljava/lang/String;)Z", "j$/util/stream/Stream", "streamBlock", "readFilePerLines", "", "numberOfLinesToRemove", "removeFirstLinesFromFile", "(Ljava/lang/String;I)V", "fileIsEmpty", "Landroid/content/Context;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FileHelper {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$readFilePerLines$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Ljava/io/BufferedReader;", "bufferedReader", "Lmm/C;", "invoke", "(Ljava/io/BufferedReader;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126771 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $streamBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126771(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$streamBlock = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BufferedReader) obj);
            return C17296C.f55119a;
        }

        public final void invoke(BufferedReader bufferedReader) {
            AbstractC16544l.m18094g(bufferedReader, TfazcFv.FktvAjSNBfwbbJp);
            InterfaceC1436k interfaceC1436k = this.$streamBlock;
            Stream streamLines = BufferedReaderRetargetClass.lines(bufferedReader);
            AbstractC16544l.m18093f(streamLines, "bufferedReader.lines()");
            interfaceC1436k.invoke(streamLines);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"j$/util/stream/Stream", "", "stream", "Lmm/C;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C126781 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ int $numberOfLinesToRemove;
        final /* synthetic */ StringBuilder $textToAppend;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "kotlin.jvm.PlatformType", "line", "Lmm/C;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ StringBuilder $textToAppend;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StringBuilder sb2) {
                super(1);
                this.$textToAppend = sb2;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C17296C.f55119a;
            }

            public final void invoke(String str) {
                StringBuilder sb2 = this.$textToAppend;
                sb2.append(str);
                sb2.append(Separators.RETURN);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126781(int i10, StringBuilder sb2) {
            super(1);
            this.$numberOfLinesToRemove = i10;
            this.$textToAppend = sb2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(InterfaceC1436k tmp0, Object obj) {
            AbstractC16544l.m18094g(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<String>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Stream<String> stream) {
            AbstractC16544l.m18094g(stream, "stream");
            Stream<String> streamSkip = stream.skip(this.$numberOfLinesToRemove);
            final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$textToAppend);
            streamSkip.forEach(new Consumer() { // from class: com.revenuecat.purchases.common.b
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileHelper.C126781.invoke$lambda$0(anonymousClass1, obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public FileHelper(Context applicationContext) {
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    private final File getFileInFilesDir(String filePath) {
        return new File(getFilesDir(), filePath);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        AbstractC16544l.m18093f(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String filePath, InterfaceC1436k contentBlock) {
        File fileInFilesDir = getFileInFilesDir(filePath);
        C15378c c15378cM9492c = AbstractC8746y3.m9492c(fileInFilesDir, new FileInputStream(fileInFilesDir));
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(c15378cM9492c);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    contentBlock.invoke(bufferedReader);
                    AbstractC7942M5.m8232a(bufferedReader, null);
                    AbstractC7942M5.m8232a(inputStreamReader, null);
                    AbstractC7942M5.m8232a(c15378cM9492c, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    AbstractC7942M5.m8232a(inputStreamReader, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                AbstractC7942M5.m8232a(c15378cM9492c, th6);
                throw th7;
            }
        }
    }

    public final void appendToFile(String filePath, String contentToAppend) {
        AbstractC16544l.m18094g(filePath, "filePath");
        AbstractC16544l.m18094g(contentToAppend, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(filePath);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        C15379d c15379dM9508c = AbstractC8752z3.m9508c(fileInFilesDir, new FileOutputStream(fileInFilesDir, true), true);
        try {
            byte[] bytes = contentToAppend.getBytes(C21307a.f67720a);
            AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
            c15379dM9508c.write(bytes);
            AbstractC7942M5.m8232a(c15379dM9508c, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(c15379dM9508c, th2);
                throw th3;
            }
        }
    }

    public final boolean deleteFile(String filePath) {
        AbstractC16544l.m18094g(filePath, "filePath");
        return getFileInFilesDir(filePath).delete();
    }

    public final boolean fileIsEmpty(String filePath) {
        AbstractC16544l.m18094g(filePath, "filePath");
        File fileInFilesDir = getFileInFilesDir(filePath);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String filePath) {
        AbstractC16544l.m18094g(filePath, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(filePath));
    }

    public final void readFilePerLines(String filePath, InterfaceC1436k streamBlock) {
        AbstractC16544l.m18094g(filePath, "filePath");
        AbstractC16544l.m18094g(streamBlock, "streamBlock");
        openBufferedReader(filePath, new C126771(streamBlock));
    }

    public final void removeFirstLinesFromFile(String filePath, int numberOfLinesToRemove) {
        AbstractC16544l.m18094g(filePath, "filePath");
        StringBuilder sb2 = new StringBuilder();
        readFilePerLines(filePath, new C126781(numberOfLinesToRemove, sb2));
        deleteFile(filePath);
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "textToAppend.toString()");
        appendToFile(filePath, string);
    }
}
