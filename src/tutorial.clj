; (ns )

(import '(ij ImagePlus)
        '(ij.process ByteProcessor))
    ;    '(ij IJ))
(let [imp (ImagePlus. "new image" (ByteProcessor. 400 400))]
  (.show imp))

;(def gold (openImage "http://imagej.net/images/AuPbSn40.jpg"))

(let [imp (ij.WindowManager/getCurrentImage)
      ip (.getProcessor imp)
      pix (.getPixels (.getProcessor imp))]
  (println (str "number of pixels: " (count pix)))
  )
